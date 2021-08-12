package com.hk.app;

//제네릭 메소드 예제
public class MethodG {

	// 제네릭으로 메소드를 정의
	public static <T> T SomeMethod(T value) {	// SomeMethod 함수
		
		System.out.println("입력한 파라미터의 값은 : "+value);
		return value;
		
	}
	
	public static void main(String[] args) {
		
		int score = 90;
		int result = SomeMethod(score); //매개변수가 정수 -> 리턴값 정수
		System.out.println("반환값은 : "+result);

	}

}
