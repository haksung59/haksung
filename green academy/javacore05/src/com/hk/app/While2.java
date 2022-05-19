package com.hk.app;

public class While2 {

	public static void main(String[] args) {
		// 1부터 100까지 합을 구하시오
		
		int i=1;	//초기값
		int sum=0;
		while(i<=100) {	//조건식
			sum = sum + i;
			System.out.println(i+"번째의 sum값은? "+sum);
			i++; // 증감식
		}
		System.out.println("sum="+sum);
	}

}
