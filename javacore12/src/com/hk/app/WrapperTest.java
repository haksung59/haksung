package com.hk.app;

public class WrapperTest {

	public static void main(String[] args) {
		
		// 기본변수의 비교
		
		int score1 = 90;
		int score2 = 90;
		if(score1 == score2) {
			System.out.println("두 수는 같습니다.");
		}
		
		//참조변수를 만든다.
		Integer s1 = new Integer(90);
		Integer s2 = new Integer(90);
		if(s1.equals(s2)) {
			System.out.println("두 수는 같습니다.");
		}else {
			System.out.println("오류입니다.");
		}
		
		// 12장
		// String - 문자열
		// StringBuffer - 장문자열
		// Math & Wrapper
		// Vector - 가변배열
		
	}

}
