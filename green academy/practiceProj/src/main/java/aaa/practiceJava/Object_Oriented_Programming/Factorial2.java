package aaa.practiceJava.Object_Oriented_Programming;

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력하시오.");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int result = factorial(i);
			
			System.out.println(i+"! = " + result);
		}

	}
	
	static int factorial(int n) {
		int result = 0;
		if(n==1)
			result = 1;
		else
			result = n * factorial(n-1);
		return result;
	}

}
