package com.hk.app;

public class Cast1 {

	public static void main(String[] args) {
		
		float num1 = 10.55f;
		int num2 = 0;
		
		num2 = (int)num1;  //num1은 실수형-> 정수형 변환
		System.out.println("1. 형변환된 값은:" + num2);  //결과값이 변경될 수 있음
		
		int no1 = 20;
		float no2 = 0.0f;
		
		no2 = (float)no1;
		System.out.println("2. 형변환된 값은:" + no2);  // 결과값이 유지됨
		
		//nbo2 = (float)no1;
		no2 = no1; //작은사이즈 -> 큰사이즈 경우 casting 생략가능함
		

	}

}
