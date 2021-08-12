package com.hk.app;

public class UseArr4 {

	public static void main(String[] args) {
		
		// 정수 배열을 만들고 10개까지 랜덤한 값을 저장해서 출력하시오.
		// 랜덤값 범위 : 1~100
		
		int[] num = new int[10];
		
		for(int i=0; i<10; i++) {
			num[i]= (int)(Math.random()*100)+1;
			System.out.println(num[i]);
		}
		System.out.println();
		
		// 이 배열값 중에서 가장 큰 값을 찾아서 출력하시오.
		int max = 0;
		for(int i=0; i<10; i++) {
			if(i==0) {
				max = num[0];
			}else {
				if(num[i]>max) {
					max=num[i];
				}
			}
		}
		System.out.println(max);
		
	}

}
