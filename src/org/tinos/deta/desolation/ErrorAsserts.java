package org.tinos.deta.desolation;
public class ErrorAsserts{
	//这个函数用于进行精度误差匹配 获取质量是否属于合格状态。
	public boolean getErrorCaculations(double inputValue, double[] matchValues, double scale) {
		double max= inputValue+ scale;
		double min= inputValue- scale;
		for(int i= 0; i< matchValues.length; i++) {
			if(!(matchValues[i]> max|| matchValues[i]< min)) {
				return true;
			}
		}
		return false;
	}
}
