package com.hk.app.test;

import java.util.Scanner;

public class Exam041 {

	public static void main(String[] args) {
		
		//재귀함수를 사용하여 파워(거듭제곱)을 출력하시오
		//3^2 = 3*3
		
		Scanner sc = new Scanner(System.in);
		System.out.print("밑을 입력하시오.");
		int n = sc.nextInt();
		System.out.print("지수를 입력하시오.");
		int a = sc.nextInt();
		
		int mx = 1;
		mx = inputpower(n, a);
		
		System.out.println(n+"^"+a+" = "+mx);

	}
	
	public static int inputpower(int n, int a) {
		
		int result = 1;
		
		if( a==0) {
			result = 1;
			
		}else {
			result = n*inputpower(n, a-1);
		}
		
		return result;
	}

}
