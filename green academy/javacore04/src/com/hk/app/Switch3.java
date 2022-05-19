package com.hk.app;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
	
		// 011 017 sk
		// 016 018 kt
		// 019	   lg

		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 앞 3자리를 입력하시오 :");
		String input = sc.nextLine();

		switch(input) {
			case "011":
			case "017":
				System.out.println("당신의 통신사는 sk입니다.");
				break;
			case "016":
			case "018":
				System.out.println("당신의 통신사는 kt입니다.");
				break;
			case "019":
				System.out.println("당신의 통신사는 lg입니다.");
				break;
			default:
				System.out.println("기타 통신사 입니다.");
				break;
		}
		
		
	}

}
