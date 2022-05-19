package com.hk.app;

public class Cast1 {

	public static void main(String[] args) {
		
		// 기본타입을 형변환을 에제
		int a = 10; //정수
		double b =5.3; //실수
		double c = 0.9; //실수
		b = a; //문제 없음.
		a = (int)c; // 오류 발생.-> 오류는 아니지만 데이터 소실.
		
		System.out.println(b);
		System.out.println(a);
		

	}

}
