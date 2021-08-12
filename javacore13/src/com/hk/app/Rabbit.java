package com.hk.app;

// 자식 클래스
// 인터페이스 상속받으면 반드시 메소드를 재정의 - why? 추상메소드
public class Rabbit extends Character2 implements Item, Weapon{
	
	boolean life;
	
	// 다중상속이 가능하다.
	public void useFastShoes() {
		// 3칸씩 이동을 하도록 구현
	}
	
	public void move() {
		// 1칸씩 이동.
		
	}
	
	public void attack() {
		
	}

}
