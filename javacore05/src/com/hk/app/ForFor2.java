package com.hk.app;

public class ForFor2 {

	public static void main(String[] args) {

		int dan = 7; // 구구단의 7단을 출력
		for(dan=7; dan<10; dan++) {
			for(int c=1; c<10; c++) {
				System.out.println(dan+"*"+c+"="+(dan*c));
			}
		}
	}

}
