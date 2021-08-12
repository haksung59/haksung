package com.hk.app;

public class For3 {

	public static void main(String[] args) {
		// 특수한 for
		int x=1;
		for( ; ; ) {//조건이 없으면 무조건 true
			System.out.println(x);
			x++;
			if(x==10000) {
				break;
			}
		}
		
		int sum=0;
		for(int i=1; sum<=100; i+=2) {
			sum = sum + i;
			System.out.println(sum);
		}
		int sum2=0;
		for(int i=1, k=1; (sum<=100&&i==100); i+=2) {
			sum2 = sum2 + i;
			System.out.println(sum2);
		}
	}

}
