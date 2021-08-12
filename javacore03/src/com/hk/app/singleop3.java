package com.hk.app;

public class singleop3 {

	public static void main(String[] args) {
		// 논리값의 부정
		boolean mil = true;
		System.out.println("mil값:"+mil);
		System.out.println("mil값의 부정:"+!mil); // boolean 값을 반대로 바꿔줌
		System.out.println("mil값의 부정의 부정"+!!mil);
		
		//  char 증감연산자
		char x = 'a' ;
		System.out.println("x의 문자출력: " + x);
		System.out.println("x의 아스키값출력: " + x);
		x = (char)(x+1); // x=++x;    // 비추천
		System.out.println("x의 아스키값출력: " + (int)x);
		
		System.out.println();
		
	}

}
