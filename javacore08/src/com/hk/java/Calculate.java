package com.hk.java;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하시오.");
		double first = reader.nextDouble();
		
		System.out.print("연산자를 입력하시오(+,-,*,/):");
		char operator = reader.next().charAt(0); //0번째 문자열을 문자로 변환
		
		System.out.print("두번째 숫자를 입력하시오.");
		double second = reader.nextDouble();
		
		
		double result = calculate(first, operator, second);
		System.out.println(result);

	}

	// 덧셈이 되는 함수를 작성하고 위의 코드를 함수가 있는 코드로 바꾸시오.
	// 함수명 calculate()
	public static double calculate(double no1, char op, double no2) {
		double cal =0;
		switch(op) {
			case '+':
				cal= no1+ no2; break;
			case '-':
				cal = no1 - no2; break;
			case '*':
				cal = no1 * no2; break;
			case '/':
				cal = no1 / no2; break;
			default:
				break;
		}
		return cal;
	}
	
	
	
}
