package com.hk.app;

public class Rabbit extends Character{
	//행과 열의 좌표를 변수 정의하고 싶다.
	//부모클래스가 있다면 상속을 할 수 있다.
	// extends 키워드를 사용함.
	
	// rx, cy 받아서 사용가능.
	// initPos() 그대로 사용가능. => 상속
	boolean life;	// 살았는지 죽었는지 체크
	Physic p = new Physic();	// 다중상속을 대체해서
							// 클래스로 포함관계 선언
	Rabbit(){
		//rx = 0; cy = 0;
		//super(); // 부모클래스 생성자(기본생성자) 호출 가능.
		super(3,2); // 부모클래스 생성자(매개변수 생성자) 호출 가능.
		//다른 멤버변수 보다 먼저 실행해야 됨 ***
		life = true;
	}
	//최상위 클래서를 통해서 참조변수 전달할 수 있다.
	public void testFunc(Object t) {
		
	}
	
	// initPos() 가 0,0 이 아니라 전체 좌표의 중앙에 좌표를 잡겠다.
	// 전체좌표 11,11 고정이라면
	public void initPos() {	// 다시 정의  => 오버라이딩 이라고 함.
		rx = CmdAnimal.width/2;
		cy = CmdAnimal.height/2;	//중앙위치함.
	}
	// 전체크기가 가변적이라면 width와 height 입력해야 함
	public void initPos(int width, int height) {	//오버로딩
		
	}
	
}
