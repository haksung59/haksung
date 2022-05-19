package com.hk.app;

import java.util.Scanner;

public class KeyInput2 {

	public static void main(String[] args) {
		// no1 에 정수입력, no2 에 정수입력
		// no1 + no2 합을 출력하시오
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1번째 정수를 입력하시오:");
		int no1 = input.nextInt();
		
		System.out.print("2번째 정수를 입력하시오:");
		int no2 = input.nextInt();
		
		System.out.println("no1과no2의합은:"+(no1+no2));
		input.close();
		
		
		

	}

}
