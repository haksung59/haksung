package com.hk.app;

import java.util.Scanner;

public class Try2dArr1 {

	public static void main(String[] args) {
		
		//조건 - 홀수인 경우
		
		//1번 - N을 입력하시오.
		//2번- N*N 행렬(배열) 생성한다.
		//3번- 0행 N/2열 배열에 1값을 대입
		//4번- 배열을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("N*N행렬의 N(홀수)값을 입력하시오.");
		int N = sc.nextInt();
		
		int[][] turtle = new int[N][N];
		
		
		int row = 0;
		int col = N/2;
		
		for(int i=1; i<=N*N; i++) { //i 대입을 값
			
			turtle[row][col] = i;
			if(i%N==0) {
				row++;
			}else {
				row--;
				col++;
				if(row<0) {
					row=N-1;
				}
				if(col==N) {
					col =0;
				}
			}
		}
		for(int r=0; r<N; r++) {
			for(int c=0; c<N; c++) {
				if(turtle[r][c]<10)
					System.out.print(" "+turtle[r][c]+" ");
				else
					System.out.print(turtle[r][c]+" ");
				
				}
			System.out.println();
		}
		
		
		

	}

}
