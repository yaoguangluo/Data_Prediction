package org.tinos.deta.NLP;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.deta.tinos.list.ListSwap;
import org.tinos.engine.analysis.Analyzer;
import org.tinos.engine.analysis.imp.CogsBinaryForestAnalyzerImp;
import org.tinos.view.obj.WordFrequency;
public class NLPTopicMatch{
	//<<NLP Algorithm of Matching The POS Scored Sentence>>.
	//This prediction algorithm mostly used for matching the best sample sentence by using score method.  
	//Theory: Yaoguang.Luo 20191228
	//Application: Yaoguang.Luo
	//Attention: need Deta Parser API OSS 
	public static String NLPBestSentenceMatch(String searchString, String[] sampleSentences) throws IOException {
		//init the deta mixed parser engine.
		Analyzer analyzer= new CogsBinaryForestAnalyzerImp();
		analyzer.initMixed();
		//init the nlp POS(part of speech) functions.
		Map<String, String> nlp = analyzer.getPosCnToCn();
		//parser the search string.
		List<String> keys= analyzer.parserMixedString(searchString);
		//find a appear frequency from the keys of search string.
		Map<String, WordFrequency> keyMap= analyzer.getWordFrequencyMap(keys);
		//get a POS score rights array from keyMap.
		double[] scoreRights= new double[keyMap.size()];
		String[] stringKeys= ListSwap.listToArray(keys);
		// I create a new algorithm of 'list to array' in my Data Swap Project. 20191228 Yaoguang. Luo
		//	public static String[] listToArray(List<String> list) {
		//		String[] output= new String[list.size()];
		//		int outputPoint= 0;
		//		Iterator<String> iterator= list.iterator();
		//		while(iterator.hasNext()) {
		//			output[outputPoint++]= iterator.next();
		//		}
		//		return output;
		//	}
		int scoreRightsPoint= 0;
		Iterator<String> keyIterator= keyMap.keySet().iterator();
		while(keyIterator.hasNext()) {
			String key= keyIterator.next();
			if(nlp.containsKey(key)) {
				String pos= nlp.get(key);
				//init rights of POS {30,20,10,3,1}
				if(pos.contains("Ãû")) {// n.
					scoreRights[scoreRightsPoint]= 30* keyMap.get(key).getFrequency();
				}else if(pos.contains("¶¯")) {//v
					scoreRights[scoreRightsPoint]= 20* keyMap.get(key).getFrequency();
				}else if(pos.contains("ÐÎ")) {//adj
					scoreRights[scoreRightsPoint]= 10* keyMap.get(key).getFrequency();
				}else {
					scoreRights[scoreRightsPoint]= 3* keyMap.get(key).getFrequency();
				}
			}else {
				scoreRights[scoreRightsPoint]= 1* keyMap.get(key).getFrequency();
			}
			scoreRightsPoint++;
		}

		//loop score array
		double[] matchScore= new double[sampleSentences.length];
		double max= 0;
		int maxPoint= 0;
		for(int i= 0; i< sampleSentences.length; i++) {
			List<String> matchList= analyzer.parserMixedString(sampleSentences[i]);
			Map<String, WordFrequency> matchMap= analyzer.getWordFrequencyMap(matchList);
			for(int j=0; j<stringKeys.length; j++) {
				if(matchMap.containsKey(stringKeys[j])) {
					matchScore[i]+= scoreRights[j]* matchMap.get(stringKeys[j]).getFrequency();
				}
			}
			if(max< matchScore[i]) {
				max= matchScore[i];
				maxPoint= i;
			}
		}
		//output
		return sampleSentences[maxPoint];	
	}
}