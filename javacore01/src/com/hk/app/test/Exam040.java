package com.hk.app.test;

import java.util.Scanner;

public class Exam040 {

	public static void main(String[] args) {
		
		//문자열을 입력을 받으면
		//abcd -> dcba 역으로 출력하시오.
		
		Scanner reader = new Scanner(System.in);
		System.out.println("문자열을 입력하시오.");
		String input = reader.next();
		
		String[] reverse = input.split("");
		
		for(int i=reverse.length-1; i>=0; i--) {
			System.out.print(reverse[i]);
		}

	}

}
