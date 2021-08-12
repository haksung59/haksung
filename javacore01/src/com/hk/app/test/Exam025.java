package com.hk.app.test;

import java.util.Scanner;

public class Exam025 {

	public static void main(String[] args) {
		
		// 정수를 입력하고 그 수가 소수인지 체크.
		// input = 8 -> 1*7 -> 1과 자신의 숫자로 곱
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오.");
		int input = sc.nextInt();
		
		for(int i=2; i<input; i++) {
			if(input%i==0) {
				System.out.println("입력하신 숫자 "+input+"은 소수가 아닙니다.");
				break;
			}else {
				System.out.println("입력하신 숫자 "+input+"은 소수입니다.");
				break;
			}
		}

	}

}
