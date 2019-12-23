package org.tinos.deta.score;
import java.util.Iterator;
import java.util.List;
//theory: Àƒ‘Ú‘ÀÀ„ 
//application: Yaoguang.Luo
public class ProbabilityScore{
	public static boolean getEstimateSumOfScoresList(List<Double> scores, double estimateValue) {
		double sum= 0;
		Iterator<Double> iterator= scores.iterator();
		while(iterator.hasNext()) {
			sum+= iterator.next();
		}
		return sum> estimateValue? true: false;	
	}
	
	public static boolean getEstimateSumOfScoresArray(double[] scores, double estimateValue) {
		double sum= 0;
		for(int i= 0; i< scores.length; i++) {
			sum+= scores[i];
		}
		return sum> estimateValue? true: false;	
	}
}