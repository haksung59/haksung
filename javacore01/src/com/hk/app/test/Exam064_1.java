package com.hk.app.test;

public class Exam064_1 {
	int ms;
	int sec;
	int min;
	
	public Exam064_1(int ms) {
		int temp = ms;
		
		this.sec = ms/1000;
		
		this.min = ms/60000;
		
		this.ms = ms%1000;
		
		calc(temp);
	}
	
	public void calc(int temp) {
		System.out.println(temp+"는 "+min+"분 "+sec+"초 "+ms+"밀리세컨드 입니다.");
	}
	
}
