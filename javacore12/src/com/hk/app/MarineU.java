package com.hk.app;

public class MarineU extends Unit {

	@Override	// 컴파일에게 오버라이딩을 할 것을 미리 얘기해줌.
	public void move() {
		// 추상메소드를 재정의 => 자식클래스 추상메소드 제거
		System.out.println("x y 방향으로 걸어갑니다.");
		
	}
	
	// Unit 클래스 속성, 기능을 물려받게 됨.

}
