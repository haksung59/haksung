package com.hk.app;

import java.util.Scanner;

public class KeyInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("이름은:");
		String name = scan.nextLine();
		
		System.out.print("정수를 입력하시오:");
		int number = scan.nextInt();
		
		System.out.print("실수를 입력하시오:");
		double real = scan.nextDouble();
		
		System.out.println("입력한 이름은?" + name);
		System.out.println("입력한 정수는?" + number);
		System.out.println("입력한 실수는?" + real);
		scan.close();

	}

}
