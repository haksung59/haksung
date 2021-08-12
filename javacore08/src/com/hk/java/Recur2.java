package com.hk.java;

public class Recur2 {

	public static void main(String[] args) {
		
		// 1+2+..10 = 반복문으로 구할 수 있음.
		
		// 재귀함수를 사용하여 구해보기.
		int sum = 0;
		int N = 0;
		sum = Sum(N);
		System.out.println(sum);
	}
	
	public static int Sum(int N) {
		int sum = 0;
		
		if(N==10) {
			sum=10;
		}else {
			sum = N+Sum(N+1);
		}
		return sum;
	}

}
