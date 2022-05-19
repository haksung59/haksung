package com.hk.app;

// 풀 클래스 정의
//Character 상속을 받고
public class Grass extends Character{
	
	// rx, cy 받아서 사용가능.
	// initPos() 그대로 사용가능. => 상속
	
	// String color 멤버변수 추가하시오.
	
	String color;
	
	public void initPos() {	// 다시 정의한다 =? 오버라이딩
		//랜덤한 좌표로.
		rx = (int)(Math.random()*(CmdAnimal.width+1));
		cy = (int)(Math.random()*(CmdAnimal.height+1));
	}
}
