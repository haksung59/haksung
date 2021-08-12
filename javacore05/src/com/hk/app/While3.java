package com.hk.app;

public class While3 {

	public static void main(String[] args) {
		
		//While 무한반복
		
		int sum = 0;
		int i = 1;
		while(true) {	// while문 안에 true이면 무한루프
			sum= sum + i;
			
			System.out.println(i+"번째 누적합:"+sum);
			i++;
			
			if(i>100 ) {
				break;
			}
		}
		
		// while(여러가지 조건이 올 수 있음)
		
	}

}
