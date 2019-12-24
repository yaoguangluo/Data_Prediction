package org.tinos.deta.score;
import java.util.Iterator;
import java.util.List;
//theory: ËÄÔòÔËËã 
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
	//refer µÑ¿¨¶û
	public static boolean getEstimateCartesianSumOfScoresArray(double input, double[] EstimateRatios, double estimateValue) {
		double sum= 0;
		for(int i= 0; i< EstimateRatios.length; i++) {
			sum+= EstimateRatios[i]* input;
		}
		return sum> estimateValue? true: false;	
	}

	//refer µÑ¿¨¶û
	public static boolean getEstimateCartesian1DSumOfScoresArray(double[] inputs, double[] EstimateRatios, double estimateValue) {
		double sum= 0;
		for(int i= 0; i< EstimateRatios.length; i++) {
			for(int j= 0; j< EstimateRatios.length; j++) {
				sum+= inputs[i]* EstimateRatios[j];
			}
		}
		return sum> estimateValue? true: false;	
	}
}