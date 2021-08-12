package com.hk.app.test;

import java.util.Scanner;

public class Exam074 {

	public static void main(String[] args) {
		// 5개까지 인덱스가 있는 정수배열에 정수를 저장하고 인덱스 번호를 입력하면
		//인덱스까지 정수배열의 합을 구하여 인덱스번호가 초과되면 예외처리를 문자열로 출력하시오.
		// int[] num = new int[5]; // 정수를 저장하고
		//0~4까지 중에서 인덱스값을 입력을 하면
		
		int[] num = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하시오.");
		for(int i=0; i<num.length; i++) {
			System.out.print((i+1)+" : ");
			num[i] = sc.nextInt();
		}
		int sum=0;
		System.out.println("몇번째 정수까지 더하시겠습니까?");
		int order = sc.nextInt();
		for(int i=0; i<order; i++) {
			sum+= num[i];
		}
		System.out.println(order+"번째까지 정수의 합은 "+sum+"입니다.");

	}

}
