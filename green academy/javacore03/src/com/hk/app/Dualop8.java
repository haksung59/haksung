package com.hk.app;

public class Dualop8 {

	public static void main(String[] args) {
		// 논리연산 예제
		char x= 'j';
		boolean result1 = x >= 'a'; //char 비교 char -> int 비교 int
		boolean result2 = x <= 'z';
		System.out.println("a의 아스키값="+(int)'a');
		System.out.println("j의 아스키값="+(int)'j');
		System.out.println("z의 아스키값="+(int)'z');
		boolean result_fine = result1 && result2;
		System.out.println("최종결과:"+result_fine);
		
		//이항연산 : 산술> 비교> 논리 이 순서로 연산이 된다

	}

}
