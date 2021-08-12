package com.hk.app;

public class Use2dArr1 {

	public static void main(String[] args) {
		
		// 1차원 배열
		int[] score1 = {100,20,30,40,
						50,60,70,80,
						90,100,10,10,
						30,40,50,60};
		
		// 2차원 배열
		int [][] score2 = { {100,20,30,40},
						   {50,60,70,80},
						   {90,100,10,10},
						   {30,40,50,60}
						};		//4*4 = 16
		// = new int[4][4];
		
		// score1 점수의 총합을 구하시오
		int sum1 = 0;
		for(int i=0; i<16; i++) {
			sum1 += score1[i];
		}
		System.out.println(sum1);
				
		//중복 for문 사용
		int sum2 = 0;
		for(int r=0; r<4; r++) {
			for(int c=0; c<4; c++) {
				sum2 = sum2 + score2[r][c];
			}
		}
		System.out.println(sum2);
		

	}

}
