package com.hk.app.test;

import java.util.Scanner;

public class Exam035 {

	public static void main(String[] args) {
		
		//재귀함수를 사용해서 n! = n* ... 3*2*1 = ?팩토리얼을 계산하시오.
		
		Scanner reader = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		int n = reader.nextInt();
		
		int mx = 1;
		mx = factorial(n,n);
		
		System.out.println(mx);
	}
	
	
	public static int factorial(int N,int max) {
		int result = 1;
		
		if(N==1) {
			System.out.print(N+"=");
			result = 1;
		}else if(N==max){
			System.out.print(N+"!="+N+"*");
			result = N*factorial(N-1,N);
		}else {
			System.out.print(N+"*");
			result = N*factorial(N-1,N);
		}
		return result;
	}


}
