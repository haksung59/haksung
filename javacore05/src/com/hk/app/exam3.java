package com.hk.app;

import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		
		//택시 운전사가 10명의 손님을 태우면 그 날 영업을 중단하고 집에 가서 쉰다고 하자.
		// 이 경우 그날의 수임을 계산하여 출력하는 프로그램을 작성하시오.
		// 
		
		Scanner read = new Scanner(System.in);
		int total = 0;
		for(int i=1; i<=10; i++) {
			
			System.out.print(i+"번째 손님의 요금입력:");
			
			int fare = read.nextInt();
			
			total += fare;	// total = total + fare
		}
		System.out.println("오늘의 손님은 10명이고 총수입은:"+total);
		
	}

}
