package com.hk.app;

public class WhileWhile2 {

	public static void main(String[] args) {
		
		//	구구단 1~3단까지 출력하시오
		
		int dan = 1;
		while (dan<=3) {
			int i=1;
			while (i<10) {
				System.out.println(dan+"*"+i+"="+(dan*i));
				i++;
			}
			System.out.println();
			dan++;	// 4가 되면 외부의 반복 while 멈춤
		}
		
	}

}
