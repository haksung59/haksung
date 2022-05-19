package com.hk.app;

public class MathRandom {

	public static void main(String[] args) {
		
		double temp1 = Math.random();	// 결과값 double
		double temp2 = Math.random();
		double temp3 = Math.random();
		System.out.println("temp1="+temp1);
		System.out.println("temp2="+temp2);
		System.out.println("temp3="+temp3);
		
		int num1 = (int)(temp1 * 10);
		int num2 = (int)(temp2 * 10);
		int num3 = (int)(temp3 * 10);
		System.out.println("num1="+(num1+1));
		System.out.println("num2="+(num2+1));
		System.out.println("num3="+(num3+1));
		
		//1~10까지 발생하는 식
		// (int)(Math.random()*10)+1 ==> 랜덤한 숫자 발생
		
	}

}
