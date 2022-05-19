package com.hk.app.test;

public class Exam038 {

	public static void main(String[] args) {
		
		//ABCDEF..Z(26개중에서) 랜덤으로 4개를 뽑아서 출력하시오.(중복x)
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String[] random = alphabet.split("");
		
		
		
		
		for(int i=0; i<1000; i++) {
			int n = (int)Math.floor(Math.random()*26);
			String temp = random[n];
			random[n] = random[0];
			random[0] = temp;
		}
		for(int i=0; i<4; i++) {
			System.out.print(random[i]);
		}

	}

}
