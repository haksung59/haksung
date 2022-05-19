package com.hk.app;

public class Exam5 {

	public static void main(String[] args) {
		// 화씨를 섭씨로 변환
		// 소수값이 나오기 때문에
		double f = 40;
		double c = 0;
		c = (f-32) * (double) 5/9;	// f= 9/5* c + 32;
		System.out.println("섭씨온도는:"+c);

	}

}
