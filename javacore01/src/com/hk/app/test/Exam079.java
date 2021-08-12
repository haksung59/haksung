package com.hk.app.test;

import java.util.Scanner;

public class Exam079 {

	public static void main(String[] args) {
		// 두 개의 문자열을 입력 받고 두 개의 문자열이 같은지 다른지를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 문자열을 입력하시오.");
		String first = sc.next();
		System.out.println("두번째 문자열을 입력하시오.");
		String second = sc.next();
		
		if(first.equals(second)) {
			System.out.println("입력한 문자열이 같습니다.");
		}else {
			System.out.println("입력한 문자열이 다릅니다.");
		}

	}

}
