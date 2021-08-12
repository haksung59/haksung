package com.hk.app.test;

import java.util.Scanner;

public class Exam009 {

	public static void main(String[] args) {
		// 세 개의 정수를 입력하고 가장 큰 수를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하시오.");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하시오.");
		int num2 = sc.nextInt();
		
		System.out.print("세번째 정수를 입력하시오.");
		int num3 = sc.nextInt();
		
		int result = 0;
		
		if (num1>num2) {
			if(num1>num3) {
				result = num1;
			}else {
				result = num3;
			}
		}else {
			if(num2>num3) {
				result = num2;
			}else {
				result = num3;
			}
		}
		
		System.out.println("입력하신 정수 중 가장 큰 수는 "+result+"입니다.");
		
		
	}

}
