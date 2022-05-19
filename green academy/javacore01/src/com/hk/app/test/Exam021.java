package com.hk.app.test;

import java.util.Scanner;

public class Exam021 {

	public static void main(String[] args) {
		
		// 정수를 입력하고 그 정수의 자리수 몇개인지 .
		// ex) 입력값: 123 -> 자리수 3
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오.");
		int input = sc.nextInt();
		
		int N = 1;
		
		for(int i = 0; i<1000; i++) {
			if((input/N)<10) {
				System.out.println("자리수 : "+(i+1));
				break;
			}
			N = N*10;
		}

	}

}
