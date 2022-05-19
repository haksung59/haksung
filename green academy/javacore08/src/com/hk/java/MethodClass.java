package com.hk.java;

public class MethodClass { //Animal 클래스라고 가정
	
	// 인스턴스 변수 = 멤버변수: 클래스의 속성을 정의함.
	int leg;
	String fname;
	int tail;
	char color;
	static int total; // 클래스 변수 = 전역변수의 속성
	
	public void eatFood() {
		System.out.println(fname+"를 먹는다.");
	}
	
	// 클래스메소드들 안에 인스턴스메소드를 호출할 수 없음
	public static int getTotal() {
		return total;		// leg는 인스턴스 변수이므로
							// 참조변수.leg 로 접근되어야 함.
	}
	public static void plusTotal(int n) { // void 리턴값이 없음.
		//eatFood(); 참조변수.eatFood로 생성되지 않았기 때문에.
		total += n;
	}
	
}
