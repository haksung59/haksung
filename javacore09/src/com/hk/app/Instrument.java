package com.hk.app;

public class Instrument {

	// 현재 속도 speed
	// 최고 속도 maxspeed
	
	//[기능]
	//현재속도를 증가시키는 함수 void speedUp(int s)
	//현재속도를 보여주는 함수 void showSpeed()
	
	int speed;
	int maxspeed;
	
	//기본생성자
	Instrument(){
		
	}
	//매개변수가 있는 생성자
	Instrument(int max) {
		maxspeed=max;
	}
	
	public void speedUp(int s) {
		speed = speed+s;
		if(speed > maxspeed) {
			speed = maxspeed;
		}
	}
	public int showSpeed() {
		return speed;
	}
	
	//breaker 함수
	public void breaker(int b) {
		speed = speed - b;
		if(speed < 0) {
			speed = 0;
		}
	}
	
	
}
