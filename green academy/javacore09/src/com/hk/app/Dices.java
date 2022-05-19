package com.hk.app;

public class Dices {

	int faceValue1;
	int faceValue2;
	
	
	public void roll() {
		faceValue1 = (int)(Math.random()*6)+1;
		faceValue2 = (int)(Math.random()*6)+1;
	}
	
	public int getDice1() {
		return faceValue1;
	}
	
	public int getDice2() {
		return faceValue2;
	}
	
	
}
