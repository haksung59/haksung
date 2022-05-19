package com.hk.app;

public class For2 {

	public static void main(String[] args) {
		// 1 2 3 4 5 를 반복 출력하시오
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);			
			}
		
		//sum = 1+2+3+4+5 를 출력하시오.
		int sum=0;	// 공통적으로 전역변수 사용하려고 함.
		// 누적합을 구하려고 하기 때문에 sum으로 0으로 시작.
		//sum = sum + 1; // 1
		//sum = sum + 2; // 1+2
		//sum = sum + 3; // 1+2+3
		for(int i=1; i<=5; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		// 반복문 안에서 선언한 변수는 지역변수라고 해서 반복문 끝나면 소멸
		// if문 안에서 선언한 변수도 동일함
		System.out.println("최종결과:"+sum);
	}

}
