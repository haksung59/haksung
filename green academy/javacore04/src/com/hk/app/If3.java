package com.hk.app;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		// 학점을 저장하는 변수 char grade로 선언
		// grade가 A이면 "당신은 90점이상입니다."
		// grade가 B이면 "당신은 80점이상입니다."
		// grade가 C이면 "당신은 70점이상입니다."
		// 기타이면 "당신은 70점 미만입니다."
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학점을 입력하시오");
		String grade = sc.nextLine();
		
		//
		char grade2 = grade.charAt(0);

			if (grade2=='A') {
				System.out.println("당신은 90점이상입니다.");
			}else if (grade2=='B') {
				System.out.println("당신은 80점이상입니다.");
			}else if (grade2=='C') {
				System.out.println("당신은 70점이상입니다.");
			}else {
				System.out.println("당신은 70점 미만입니다.");
			}

	}

}
