package com.hk.app;

public class UseArr1 {

	public static void main(String[] args) {
		
		// 점수 score 인덱스 5인 배열 선언하고
		// 각각의 값을 합쳐서 합계하고 평균값을 출력하시오.
		
		int[] score = {100,50,70,90,65};
		
		int sum=0;
		double avg=0;
		
		for (int i=0; i<score.length; i++) {
			sum += score[i];
		}System.out.println(sum);
		avg = (double)sum/score.length;
		System.out.println(avg);
	}

}
