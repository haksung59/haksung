package com.hk.java;

public class Func1 {

	public static void main(String[] args) {
		
		// c = a^2 +b^2
		int c = 0;
		int a = 5, b=7;
		c = a*a + b*b;
		System.out.println(c);
		
		int x = 6, y=8;
		c= x*x + y*y;
		System.out.println(c);
		
		//함수를 사용
		int i = 9, j=7;
		System.out.println(squareSum(i,j));
		
		//1~10 사이의 랜덤한 숫자를 두개 발생해서 출력하시오.
		int no1 = genRandom(10);
		int no2 = genRandom(10);
		System.out.println(no1+","+no2);

	}
	public static int squareSum(int n, int k) {
		int result = n*n + k*k;
		return result;
	}
	
	//랜덤한 숫자를 발생시키는 함수
	public static int genRandom(int N) {
		int result = (int)(Math.random()*N)+1;
		return result;
	}
}
