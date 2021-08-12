package com.hk.app.test;

public class Exam017 {

	public static void main(String[] args) {
		
		//피보나치 수열을 출력 (10개까지 출력
		// 0(기본값),1(기본값),1(앞에 두개 더해서),2,3,5,8,13,21,34
		
		int[] fibonacci = new int[10];
		
		for (int i=0; i<fibonacci.length; i++) {
			if (i<=1) {
			fibonacci[0] = 0;
			fibonacci[1] = 1;
			}else
			fibonacci[i] = fibonacci[i-2]+fibonacci[i-1];
			System.out.print(fibonacci[i]+"\t");
		}

	}

}
