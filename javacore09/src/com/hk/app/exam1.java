package com.hk.app;

public class exam1 {

	public static void main(String[] args) {
		
		Dices dice = new Dices();
		dice.roll();
		int result = dice.getDice1() + dice.getDice2();
		
		System.out.println("첫번째 주사위 눈은"+ dice.getDice1());
		System.out.println("두번째 주사위 눈은"+ dice.getDice2());
		System.out.println("주사위의 합은"+result);
		
		
		
	}

}
