package com.hk.app.test;

import java.util.Scanner;

public class Exam003 {

	public static void main(String[] args) {
		
		//두개의 실수를 입력을 받아서 곱한 결과를 출력하시오.(sc.nextDouble()로 받음)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("실수를 입력하시오.");
		double realnumber1 = sc.nextDouble();
		
		System.out.println("두번째 실수를 입력하시오.");
		double realnumber2 = sc.nextDouble();
		
		double result = realnumber1 * realnumber2;
				System.out.println(result);
		
		
	}

}
