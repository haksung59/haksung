package com.hk.app;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 이수학점을 입력하시오");
		int grade = sc.nextInt();
		
		System.out.println("토익점수를 입력하시오");
		int toeic = sc.nextInt();
		
		if (grade>=140 && toeic>=700) {
			System.out.println("졸업을 축하합니다.");
		}else if (grade>=140 && toeic<700) {
			System.out.println("아쉽지만 수료하셨습니다.");
		}else {
			System.out.println("졸업이 불가합니다.");
		}
		

	}

}
