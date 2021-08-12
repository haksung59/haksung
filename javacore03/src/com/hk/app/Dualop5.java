package com.hk.app;

public class Dualop5 {

	public static void main(String[] args) {
		// 비교 이항 연산
		int a = 10;
		int b = 15;
		boolean r1 = a>b; // r1의 결과는?
		System.out.println("r1="+r1);
		System.out.println("r1="+(a>b));
		
		int c = 'A';
		int d = 'B';
		System.out.println((int)c);
		System.out.println((int)d);
		boolean r2 = c>d; // 이항연산자 int > int 65 > 66
		System.out.println("r2="+r2);
		
		// test
		double e = 0.1d;
		float f = 0.1f;
		System.out.println((float)e);
		System.out.println((float)f);
		boolean r3 = (e == f);// float과 double 소수점 자리의 정밀도 차이가 있음
		System.out.println("r3="+r3);

	}

}
