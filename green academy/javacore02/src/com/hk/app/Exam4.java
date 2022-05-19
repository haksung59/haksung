package com.hk.app;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		
		//반지름 r 정수로 입력해서 원의 넓이를 구하라
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("반지름을 입력하시오.");
		int r = input.nextInt();
		double area = 0;
		area = 3.14 * r * r;
		System.out.println("원의넓이는:" + area);
		

	}

}
