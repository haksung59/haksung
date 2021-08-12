package com.hk.app;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		// 5개의 정수를 입력 받아서
		// 그 중에서 최소값을 찾아서 출력하시오.
		
		Scanner reader = new Scanner(System.in);
		int min=0;
		
		for (int i=0; i<5; i++) {
			System.out.print("숫자를 입력하시오:");
			int input = reader.nextInt();
			
			if(i==0) {	//1번째인 경우 : 0이 순서적으로 처음.
				min = input;
			}else {
				if(input<min) {
					min = input;
				}
			}
		}
		
		System.out.println("최솟값은: "+min);

	}

}
