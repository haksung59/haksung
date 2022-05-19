package com.hk.app;

import java.text.DecimalFormat;	//java.text 패키지 사용
import java.text.ParseException;

public class DeciFormat {

	public static void main(String[] args) {
		// 숫자를 표시함. -> DecimalFormat 클래스.
		// 10000000 -> 10,000,000 형식화해서 출력.
		
		DecimalFormat df = new DecimalFormat("#,###.###"); //형식을 정의함.
		System.out.println("총 금액 : "+df.format(123456789.3456));
		
		String dataResult = "234,567,734,23";	//포맷화된 문자열
		
		try {
			Number calResult2 = df.parse(dataResult);	//관련타입 Number 레퍼클래스
														// 
			double calRes2 = calResult2.doubleValue();
			System.out.println(calResult2);
		} catch(ParseException e) {
			e.printStackTrace();
		}
	}

}
