package com.hk.app;

public class CompDfnVar {

	public static void main(String[] args) {
		
		// 기본변수- 클래스개념은 아니다.
		int score; // 저장공간 1개
		score = 90;
		System.out.println(score);
		
		//배열변수- 클래스개념은 아니다.
		int[] age = new int[10]; // 같은 저장공간 안에
		age[0] = 30;
		System.out.println(age[0]);
		
		//클래스로 정의된 참조변수- 클래스개념
		//선언
		CompClass product = new CompClass();
		//서로 다른 저장공간들의 모임
		product.price = 1000;
		System.out.println(product.price);
		
	}
}
