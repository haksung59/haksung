package com.hk.app;

public class NewCalUtil extends CalUtil{
	
	// 오버라이딩
	
	// substract() 구현
	
	public double avg() {
		double result = 0;
		if(third==0) {
			result = sum() / 2.0;
		}else {
			result = sum() / 3.0;
		}
		result = Math.round(result);
		
		return result;
	}
	
	public int substract() {
		int result = 0;
		result = left- right;
		return result;
	}

}
