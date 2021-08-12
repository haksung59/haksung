package com.hk.app;

public class Dualop7 {

	public static void main(String[] args) {
		// c라는 회사가 직원채용
		// boolean mil = true 그리고 double tall = 170 이상
		// 이철수 채용되겠는가?
		// lee_m 군필, lee_t 180이다.
		// 합격여부를 true 와 false 로 출력하시오.
		
		int lee_t= 180;
		boolean lee_m = true;
		
		boolean pass_c = (lee_t >=170) && (lee_m == true);
		System.out.println("c회사 합격:"+pass_c);
		

	}

}
