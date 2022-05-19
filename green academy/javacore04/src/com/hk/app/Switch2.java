package com.hk.app;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// 두개 정수 입력받는다 int num1 num2
		//사칙연산 기호를 입력받음 String op (*를 입력하면)
		//result = num1 * num2 출력하시오
		// switch문을 사용하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력 하시오.");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수를 입력하시오.");
		int num2 = sc.nextInt();
		
		System.out.print("연산기호를 입력하시오");
		String op = sc.next();
		
		double result = 0;		
		
		switch(op) {
		case "*": result = num1 * num2;
		break;
		case "+": result = num1 + num2;
		break;
		case "/": result = num1 / num2;
		break;
		case "-": result = (double)num1 - (double)num2;
		break;
		default:
		break;
		}
		System.out.println(num1+op+num2+"="+result);

		
	}

}
