package com.hk.java;

public class Func3 {

	public static void main(String[] args) {
		
		// 일만하는 함수: "FUNTION" 라는 글자를 10번 출력하는 PrintText()
		// 함수명 : printText()
		printText();
		
		// 일을 하고 반환하는 함수 : 어떤 숫자를  입력하면 그 숫자의 제곱을 계산해서 반환하는 함수
		// sqrt(입력값);
		// 결과값을 출력하시오
		double temp = sqrt(15);
		System.out.println("결과는:"+temp);
		

	}
	
	public static void printText() {
		for(int i=0; i<10; i++) {
			System.out.print("FUNCTION ");
		}System.out.println();
		return;
	}
	
	public static double sqrt(double in) {
		double result = in * in;
		return result;
	}

}
