package org.tinos.deta.isolation;
public class MatrixIsolationFilter{
	//带精度 多维矩阵中非有效成份筛选过滤算法
	//Theory，模式识别，专家系统， 罗瑶光Yaoguang.Luo
	//Application 罗瑶光
	//scaleDistance 为 卷积筛选的精度， PCARatio为有效邻接总数的量比
	//适用于 索贝尔 emboss等卷积处理过滤后，进行噪声过滤。增加精准度。
	public int[][] getIsolationFilterMartix2D(int[][] input, int scaleDistance, double PCARatio){
		double compareRate= Math.pow(1+ scaleDistance* 2, 2)* PCARatio;
		int[][] output= new int[input.length][input[0].length];
		for(int i= scaleDistance; i< input.length- scaleDistance; i++){
			for(int j= scaleDistance; j< input[0].length- scaleDistance; j++){
				if(0< input[i][j]) {
					int PCA= 0;
					for(int p= -scaleDistance; p< scaleDistance; p++) {
						for(int q= -scaleDistance; q< scaleDistance; q++) {
							if(input[p][q]== input[i][j]) {
								PCA++;
							}
						}
					}	
					//筛选过滤
					if(PCA> compareRate) {
						output[i][j]= input[i][j];
					}
				}
			}
		}
		return output;
	}

	public int[][][] getIsolationFilterMartix3D(int[][][] input, int scaleDistance, double PCARatio){
		double compareRate= Math.pow(1+ scaleDistance* 2, 3)* PCARatio;
		int[][][] output= new int[input.length][input[0].length][input[0][0].length];
		for(int i= scaleDistance; i< input.length- scaleDistance; i++){
			for(int j= scaleDistance; j< input[0].length- scaleDistance; j++){
				for(int k= scaleDistance; k< input[0].length- scaleDistance; k++){
					if(0< input[i][j][k]) {
						int PCA= 0;
						for(int p= -scaleDistance; p< scaleDistance; p++) {
							for(int q= -scaleDistance; q< scaleDistance; q++) {
								for(int r= -scaleDistance; r< scaleDistance; r++) {
									if(input[p][q][r]== input[i][j][r]) {
										PCA++;
									}
								}
							}
						}	
						//筛选过滤
						if(PCA> compareRate) {
							output[i][j][k]= input[i][j][k];
						}
					}
				}
			}
		}
		return output;
	}
}