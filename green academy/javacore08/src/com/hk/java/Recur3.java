package com.hk.java;

public class Recur3 {

	public static void main(String[] args) {
		
		// 3의 4제곱 = 3*3*3*3 = pow(num,N)
		//pow(3,4) = 3* pow(3,3)
		
		int mx = pow(3, 4);
		System.out.println("mx="+mx);
		System.out.println("Math.pow()="+Math.pow(3.0,4.0));

	}
	
	public static int pow(int num, int N) {
		int result = 1;
		if(N==0) {
			result = 1;
		}else {
			result = num * pow(num, N-1);
		}
		return result;
	}
}
