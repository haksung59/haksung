package com.hk.app.test;

import java.util.Scanner;

public class Exam022 {

	public static void main(String[] args) {
		
		// 정수를 입력하면 역으로 출력
		// ex) 1234 입력 -> 4321 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오.");
		int input = sc.nextInt();
		
		int N = 1;
		for(int i=1; i<10000; i++) {
			N *= 10;
			if(input/N==0) {
				N = i;
				break;
			}
		}
		int[] num = new int[10000];
		
		for(int j=1,i=0; i<N; i++) {
			num[i]= input/j-input/(j*10)*10;
			j*=10;
			System.out.print(num[i]);
		}
	}

}
