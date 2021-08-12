package com.hk.app;

public class Continue {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i%2==0) {
			continue;	// 이 문장 아래의 경우는 실행을 건너뜀. 그리고 다음 반복 계속 함.
			}
			System.out.println(i+"번째 출력입니다.");
		}

	}

}
