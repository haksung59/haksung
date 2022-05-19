package com.hk.app;

public class exam1 {

	public static void main(String[] args) {
		// 1부터 100까지의 모든 짝수들의 합을 계산하는 자바 프로그램을 코드를 작성하되 for 문을 사용하시오.
		
		int sum=0;
		for (int n=0; n<=100; n++){
			if (n%2==1) {
				continue;
			}
			sum = sum + n;
			
		}
		System.out.println(sum);
	}

}
