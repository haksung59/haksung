package com.hk.app;

public class Dualop6 {

	public static void main(String[] args) {
		// 자바점수 70 이상 그리고 토익점수가 600점 이상
		// 회사에서 뽑겠다
		int kjava = 70;  //x경우
		int ktoe = 550;  //y경우
		boolean pass_a = (kjava>=70) && (ktoe >= 600);
		
		// 자바점수 70 이상 또는 (||) 토익점수가 600점 이상
		// 
		boolean pass_b = (kjava>=70) || (ktoe >=600);
		System.out.println("a회사 취업성공="+pass_a);
		System.out.println("b회사 취업성공="+pass_b);
		
		// 이항 연산 정리
		// 산술연산 + - * / %
		// 비교연산 > < >= <= == !=
		// 논리연산 && ||

	}

}
