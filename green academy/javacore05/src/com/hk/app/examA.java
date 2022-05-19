package com.hk.app;

import java.util.Scanner;

public class examA {

	public static void main(String[] args) {
		// w=5 (입력을 받아서)
		// 숫자를 1~w*w까지 출력하기
		//  1  2  3  4  5
		//  6  7  8  9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25

		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오.");
		int w = sc.nextInt();
		
		
		for(int i=1,n=1; i<=w*w; i++) {
			
			if (i<10) {
				System.out.print(" "+i+"\t");
			}else {
			System.out.print(i+"\t");
			}
			if (i==w*n) {
				n++;
				System.out.println();
				
				
			}
		}
	}

}
