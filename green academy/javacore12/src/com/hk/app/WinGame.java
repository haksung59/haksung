package com.hk.app;

public class WinGame {

	public static void main(String[] args) {
		
		MarineU man = new MarineU();
		man.move();
		
		TankU tank = new TankU();
		tank.move();
		
		//Unit unit = new Unit(); // 에러발생 why? 추상클래스는 참조변수를 만들 수 없음.

	}

}
