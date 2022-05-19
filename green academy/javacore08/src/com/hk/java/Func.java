package com.hk.java;

public class Func {

	public static void main(String[] args) {
		
		// 변수에 값을 전달
		int score = 0;
		score = 80;		//값을 할당 =
		score++;
		System.out.println("점수는: "+score);		// 값을 가져옴
		// 함수에 값을 전달
		int math = 70, kor = 60;
		sum(math,kor);		// 입력파라미터로 값을 할당
		System.out.println(math+","+kor);		//함수이름을 호출
		

	}
	// 두 개의 성적의 합.
	public static void sum(int a, int b) {
		int sum = a + b;
		a++; b++;
		System.out.println("두 과목의 합은: "+sum);
		
		// 함수내에서 정의된 변수나 입력파라미터 변수 - 지역변수
	}

}
