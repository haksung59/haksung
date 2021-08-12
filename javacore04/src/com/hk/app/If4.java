package com.hk.app;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		// 점수를 입력하고
		// 점수가 90점이상이면 "학점은 A입니다."
			// 95이상이면 "학점은 A+입니다"
		// 점수가 80점이상이면 "학점은 B입니다."
			// 85이상이면 "학점은B+입니다"
		//점수가 70점이상이면 "학점은 C입니다."
			// 75이상이면 "학점은 C+입니다"
		// 기타면 "학점은 D입니다."
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오");
		int score = sc.nextInt();
		String grade = "";
		if (score >= 90) {
			grade = "A";
			if(score>=95) {
				grade=grade+"+";
			}
		}else if (score >= 80) {
			grade = "B";
			if(score>=85) {
				grade=grade+"+";
			}
		}else if (score >=70) {
			grade = "C";
			if(score>=75) {
				grade=grade+"+";
		}else {
			grade = "D";
		}
		System.out.println("학점은"+grade+"입니다.");
		}
	}
}

