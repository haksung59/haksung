package com.hk.java;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수 값을 입력하시오.");
		int number = input.nextInt();
		
		int output = myABS(number);
		System.out.println(output);
		
		int num = 110;
		int output2 = Math.abs(num);
		System.out.println(output2);

	}
	
	//myABS(int n)
	public static int myABS(int n) {
		int result = 0;
		// 음수는 양수로 양수는 음수로 변환
		if(n==0) {
			result = 0;
		}else if(n>0) {
			result = n-(2*n);
		}else {
			result = n+(2*n);
		}
		return result;
	}
	
}
