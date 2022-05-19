package com.hk.app.test;

import java.util.Scanner;

public class Exam015 {

	public static void main(String[] args) {
		
		//팩토리얼수를 출력
		//입력값을 N = 5 입력하면
		//출력 1*2*3*4*N(5) 계산해서 출력하시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오");
		int N = sc.nextInt();
		
		int factorial = 1;
		for(int i=1; i<=N; i++) {
			factorial *= i;
		}System.out.println(factorial);
	}

}
