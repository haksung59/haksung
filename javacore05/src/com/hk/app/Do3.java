package com.hk.app;

public class Do3 {

	public static void main(String[] args) {
		//do while 문을 사용하여
		// 1~100까지 합을 구하시오.
		
		int n = 1;	
		int sum= 0;
		
		do {
			sum=sum+n;
			n++;
		}while(n<=100);
		
		System.out.println(sum);
	}

}
