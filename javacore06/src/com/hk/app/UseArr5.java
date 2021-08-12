package com.hk.app;

public class UseArr5 {

	public static void main(String[] args) {
		
		// 기본타입 선언
		int score = 0; // 타입 변수명 = 값대입
		// 배열타입 선언
		int[] scores = {1,2,3,4,5};	// 1번 new int[5];
		// 인덱스 0 1 2 3 4 이런 순서로 된다.
		
		// 배열변수의 각각의 총합
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);

	}

}
