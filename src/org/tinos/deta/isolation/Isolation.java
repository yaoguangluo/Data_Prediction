package org.tinos.deta.isolation;
public class Isolation{
	public static double[] getCorrelation(double[] firstArray, double[] secondArray) {
		double[] output= new double [firstArray.length];
		for(int i= 0; i< firstArray.length; i++) {
			output[i]= firstArray[i]/ secondArray[i];
		}
		return output;
	}
}