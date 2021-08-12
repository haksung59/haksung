package com.hk.app;

public class InitArr1 {

	public static void main(String[] args) {

		// 초기화 방법 1
		int[] age = new int[3];
		age[0]=10;
		age[1]=20;
		age[2]=30;
		
		// 초기화 방법 2
		int num[] = {1,2,3};
		
		// 초기화 방법3 - 반복적인 규칙있을 때
		int[] same = new int[3];
		for (int i=0; i<3; i++) {
			same[i]=i+1;
		}
		

	}

}
