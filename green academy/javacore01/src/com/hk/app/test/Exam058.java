package com.hk.app.test;

public class Exam058 {

	public static void main(String[] args) {
		
		//소수점 n번째에서 반올림하여 출력하시오.
		//실수값 : 123,3452 이라면 3번째에서 반올림
		//결과값: 123.36
		
		double realnum = 123.3452;
		
		double result = Math.round(realnum*100.0)/100.0;
		
		System.out.println(result);

	}

}
