package com.hk.app;

public class Exam1 {

	public static void main(String[] args) {
		
		// 삼각형을 출력하시오.
		int[][] triangle1 = new int[5][5];
		int[][] triangle2 = new int[5][5];
		int[][] triangle3 = new int[5][5];
		int[][] triangle4 = new int[5][5];
		
		//1번째
		for(int r=0; r<5; r++) {
			for(int c=4; c>r; c--) {
				System.out.print(" ");
			}
			for(int c=0; c<r+1; c++) {
				System.out.print("*");
			}System.out.println();
		}
		
		System.out.println();
		
		//2번째
		for(int r=0; r<5; r++) {
			for(int c=0; c<5; c++) {
				if(c>=r+1) {
					System.out.print(" ");
					}else {
						System.out.print("*");
					}
			}System.out.println();
		}
		
		System.out.println();
		
		//3번째
		for(int r=0; r<5; r++) {
			for(int c=0; c<r; c++) {
				System.out.print(" ");
			}
			for(int c=r; c<5; c++) {
				System.out.print("*");
			}System.out.println();
		}
		
		System.out.println();
		//4번째
		for(int r=0; r<5; r++) {
			for(int c=0; c<5-r; c++) {
				System.out.print("*");
			}
			for(int c=0; c<r; c++) {
				System.out.print(" ");
			}System.out.println();
		}
		
				
	}

}
