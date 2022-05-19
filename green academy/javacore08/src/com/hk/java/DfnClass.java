package com.hk.java;

public class DfnClass {
	
	
	int score; //멤버변수=인스턴스변수 - 클래스의 속성값
	String name;
	static int total=10; //클래스 변수 - 클래스의 전체적인 특징을 나타내는 변수

	// 메소드는 클래스의 동작을 나타내는 일
	public void print2Grade() {
		if(score>=60) {
			System.out.println(name+"은 pass입니다.");
		}else {
			System.out.println(name+"은 fail입니다.");
		}
	}
	
	public int min(int a, int b) {
		int result=0;
		if(a>b) {
			result=b;
		}else {
			result=a;
		}
		return result;
	}
}
