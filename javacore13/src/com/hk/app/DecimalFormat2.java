package com.hk.app;

import java.text.DecimalFormat;

public class DecimalFormat2 {

	public static void main(String[] args) {
		
		// 반지름 r = 25.3인 원이 있다.
		// 원의 넓이를 계산 Math.PI * r * r 을 계산한다.
		// 출력할 때 DecimalFormat 사용해서 출력하시오. "#,###.#" 형식으로 출력.
		
		double area = 0;
		double r = 25.3;
		area = Math.PI * r * r;
		
		DecimalFormat df = new DecimalFormat("#,###.#");
		
		System.out.println("원의 넓이 : "+df.format(area));

	}

}
