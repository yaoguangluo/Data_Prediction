package org.tinos.deta.image;
public class ImagePixExtract{
	//思想：平面几何， 模式识别
	//作者：罗瑶光
	//适用于波形图变换数列.
	//将像素矩阵指定的RBG颜色值拿出来形成波形数列输出
	public static int[] getVWaveFromImagePix(int[][] pixMap, int RGB){
		int[] output= new int[pixMap.length];
		Next:
		for(int i= 0; i< pixMap.length; i++) {
			for(int j= 0; j< pixMap[0].length; j++) {
				if(RGB== pixMap[i][j]) {
					output[i]= j;
					continue Next;
				}
			}
		}
		return output;
	}
	
	public static int[] getHWaveFromImagePix(int[][] pixMap, int RGB){
		int[] output= new int[pixMap[0].length];
		Next:
		for(int i= 0; i< pixMap[0].length; i++) {
			for(int j= 0; j< pixMap.length; j++) {
				if(RGB== pixMap[j][i]) {
					output[i]= j;
					continue Next;
				}
			}
		}
		return output;
	}
}