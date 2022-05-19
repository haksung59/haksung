package com.hk.app;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		// 10명이 아니라 총수입 120000원 넘으면
		// 택시영업을 마치겠다. 이런경우 몇 명을 태웠고
		// 총수입은 얼마인가?
		
		Scanner read = new Scanner(System.in);
		int total = 0;
		for(int i=1; total<=120000; i++) {
			
			System.out.print(i+"번째 손님의 요금입력:");
			
			int fare = read.nextInt();
			
			total += fare;	// total = total + fare
		}
		System.out.println("오늘의  총수입은:"+total);
		
		
	}

}
