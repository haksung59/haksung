package com.hk.app;

public class If {

	public static void main(String[] args) {
		
		int score = 70;
		// 점수가 60점 이상 합격이면 출력
		if(score>=60) {	// 비교식 참 or 거짓
			System.out.println(score+"점 '합격'입니다.");
		}
		
		int attend = 10; //0~100 사이값
		String name = "김철수";
		if(attend ==100) {
			System.out.println(name+"은(는) 개근입니다");
		}else {
			System.out.println("출석률은"+attend+"% 입니다.");
		}
		
		int toeic = 600; //0-900 사이값
		if(toeic>=900) {
			System.out.println("당신은 원어민 수준입니다");
		}else if(toeic>=800) {
			System.out.println("프리토킹수준입니다");
		}else if(toeic>=700) {
			System.out.println("보통입니다.");
		}else {
			System.out.println("공부하세요!");
		}

	}

}
