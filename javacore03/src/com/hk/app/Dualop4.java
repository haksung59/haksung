package com.hk.app;

public class Dualop4 {

	public static void main(String[] args) {
		// % 나머지 연산자
		int x = 126;
		int y = 10;
		int div = x / y;
		int remain = x % y;
		System.out.println("몫은:"+div);
		System.out.println("나머지는:"+remain);
		
		// % 이용해서 짝수인지 홀수인지 구별가능
		// (ex) input = 33, 35, 13
		// input % 2 = 1, 1, 1 (2로 나눈 나머지가 1이면 홀수)
		// (ex) input = 10, 24, 120
		// input % 2 = 0, 0, 0 (2로 나눈 나머지가 0이면 짝수)
		
		//배수 - 3의배수 3 6 9 12 ...
		//(ex) input = 33, 9 24
		//input %3= 0, 0, 0 (3으로 나눈 나머지가 0이면 3의배수)
		
		//연습 - 5의 배수인가? 15 29
		
		int a = 24;
		System.out.println(a%3);

	}

}
