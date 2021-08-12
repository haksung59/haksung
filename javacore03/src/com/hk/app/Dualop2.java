package com.hk.app;

public class Dualop2 {

	public static void main(String[] args) {
		// 소수점 반올림 예제
		float input = 4.56789f; // 소수 3번째 자리까지 반올림
		float result = input * 1000;
		float result_rnd = Math.round(input * 1000);
		float result_fine = Math.round(input * 1000) / 1000f;
		//Math.round(a)
		System.out.println("result=" + result);
		System.out.println("result_rnd=" + result_rnd);
		System.out.println("result_fine=" + result_fine);
	}

}
