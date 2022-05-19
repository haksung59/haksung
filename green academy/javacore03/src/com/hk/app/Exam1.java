package com.hk.app;

public class Exam1 {

	public static void main(String[] args) {
		// 사과의 개수가 123개이고 이를 바구니에 담고자 한다. 바구니는 10개씩 담을 수 있다고 한다면 몇 개의 바구니가 필요한가?
		
		int apple = 123;
		int baskets = 0;
		int cnt = 10;	// 바구니당 담을 수 있는 사과수
		
		baskets = apple / cnt;
		
		baskets = (apple%cnt==0) ? baskets : ++baskets;
		
		System.out.println("바구니는" + baskets + "개가 필요하다");

	}

}
