package com.hk.app;

public class DropshipU extends Unit{

	// 오버라이딩 => 조건 리턴타입, 함수명, 매개변수 완전히 일치해야 됨.
	public void move() {
		// 추상메소드를 재정의 => 자식클래스 추상메소드 제거.
		System.out.println("x y 방향으로 날아갑니다.");
		
	}
	

}
