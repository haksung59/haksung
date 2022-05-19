package com.hk.app.test;

import java.util.Scanner;

public class Exam031 {

	public static void main(String[] args) {
		
		// 양의정수를 입력을 받은 n의 모든 약수를 출력하시오.
		Scanner reader = new Scanner(System.in);
		System.out.println("양의 정수를 입력하시오.");
		int N = reader.nextInt();
		
		if(N<=0) {
			System.out.println("'양의 정수'를 입력하시오.");
			N = reader.nextInt();
		}
		
		System.out.print(N+"의 약수 : ");
		for(int i=1; i<N; i++) {
			if(N%i==0) {
				System.out.print(i+" ");
			}
		}

	}

}
