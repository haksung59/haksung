package com.hk.app;

public class Triop1 {

	public static void main(String[] args) {
		// x값이 양수? 음수?
		int x = -10;
		String result = (x>=0) ? "양수" : "음수"; // 조건식 ? 식1 : 식2
		System.out.println(x+ "는" + result);

	}

}
