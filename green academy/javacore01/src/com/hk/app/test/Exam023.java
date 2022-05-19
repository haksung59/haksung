package com.hk.app.test;

public class Exam023 {

	public static void main(String[] args) {
		
		// a=5 b=3
		// result 5의 3승 -> 5*5*5 계산
		// a=3 b=4
		// result = 3*3*3*3 계산
		
		int a = 5;
		int b = 3;
		int result = 1;
		
		for(int i=0; i<b; i++) {
			result *= a;
		}System.out.println(result);
		
		
		int a2 = 3;
		int b2 = 4;
		int result_2 = 1;
		
		for(int i=0; i<b2; i++) {
			result_2 *= a2;
		}System.out.println(result_2);
	}

}
