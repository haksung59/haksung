package com.hk.app;

import java.util.Scanner;

public class Do {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("숫자를 입력하시오:");
		input = sc.nextInt();
		System.out.println("입력값: "+input);
		
		while(input!=0) {
		System.out.print("숫자를 입력하시오:");
		input = sc.nextInt();
		
		System.out.println("입력값: "+input);
		}
		*/
		int input;
		do {
			System.out.print("숫자를 입력하시오: ");
			input = sc.nextInt();
			
			System.out.println("입력값: "+input);
		}while(input!=0);
	}

}
