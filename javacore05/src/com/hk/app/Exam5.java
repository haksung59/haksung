package com.hk.app;

public class Exam5 {

	public static void main(String[] args) {
		
		
		//	1-100까지 중에서
		//	3의 배수의 총합
		//	3의 배수가 아닌 수의 총합을 구하시오
		
		int sum=0;
		int sum2=0;
		
		for (int i=1; i<=100; i++) {
			if(i%3==0) {
				sum+=i;
			}else {
				sum2+=i;
			}
		}
			System.out.println("3의배수의합:"+sum);
			System.out.println("3의배수 아닌 합:"+sum2);
			System.out.println("위의 두 합:"+(sum+sum2));
	}	

}
