package com.hk.app.test;

import java.util.Scanner;

public class Exam042 {

	public static void main(String[] args) {
		
		//1차원배열을 이용하여 평균을 구하시오(인덱스 10개값)
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하시오.");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		int avg = sum/10;
		System.out.println(avg);

	}

}
