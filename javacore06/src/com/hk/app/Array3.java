package com.hk.app;

public class Array3 {

	public static void main(String[] args) {
		
		// String 문자(열)배열 name 인덱스 3개인 변수 선언
		// double 실수배열 weight 인덱스 3개 변수 선언
		
		// 각각의 이름과 몸무게를 대입하고
		
		// 출력하시오
		
		
		
		String[] name = new String[3];
		name[0] = "김학성";
		name[1] = "안찬익";
		name[2] = "이재경";
		
		double[] weight = {58.5, 70.2, 91.1};
		
		System.out.println(name[1]);
		System.out.println(name[0]);
		System.out.println(weight[1]);
		System.out.println(weight[0]);
		System.out.println(weight[2]);
		
	}

}
