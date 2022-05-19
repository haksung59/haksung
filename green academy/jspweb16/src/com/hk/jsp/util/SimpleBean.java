package com.hk.jsp.util;

public class SimpleBean {
	
	//메소드 정의: 이름을 입력하면 인사문장을 출력.
	public String printHello(String name) {
		String message;
		message = "안녕하세요?" + name;
		return message;
	}

}
