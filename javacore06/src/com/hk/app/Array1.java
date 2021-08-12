package com.hk.app;

public class Array1 {

	public static void main(String[] args) {
		
		// 기본타입 정의
		int score = 100;	//정수선언 변수명-(값)
		// 배열변수 선언
		
		int[] age= new int[3];		// ★타입[] 배열명 선언 
									// ★new 타입 [갯수]
		// age[0] , age[1], age[2] 배열 변수 생성
		int[] age2 = {1,2,3};		//각각의 값을 통해 갯수를 알 수 있음.
		// age[0]=1, age[1]=2, age[2]=3 배열 변수 생성(초기화됨)
		
		System.out.println(score);
		
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		
		System.out.println(age2[0]);
		System.out.println(age2[1]);
		System.out.println(age2[2]);

	}

}
