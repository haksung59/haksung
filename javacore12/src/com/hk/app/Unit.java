package com.hk.app;

// 추상클래스 => 추상메소드가 있음.
public abstract class Unit {
	
	int x;
	int y;
	
	abstract public void move(); //{} 없음.
	void stop() {/* 현재 위치에 멈춤*/};

}
