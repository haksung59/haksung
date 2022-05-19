package com.hk.app;

public class StringBufferTest {
	
	//14장 예외처리 클래스
	//15장 자료구조
	//16장 윈도우 클래스=스윙
	// 17장
	// 18

	public static void main(String[] args) {
		// 장문의 문장을 처리하고 싶을 때 사용하면 유용하다.
		StringBuffer html = new StringBuffer();
		html.append("<ul>\n");
		html.append("<li>중식</li>\n");
		html.append("<li>한식</li>\n");
		html.append("</ul>\n");
		
		// 중간에 데이터를 넣고 싶다.
		int idx = html.lastIndexOf("<li>");
		html.insert(idx, "<li>양식</li>\n"); // 위치를 알면 삽입가능.
		
		// html.reverse();		//자체 참조변수 데이터를 변경함.
		// html.toString(); 	// String으로 변경해서 비교할 때.
		
		System.out.println(html.toString()); //toString()은 문자열변환해준다.
		//html 코드를 자바에서 처리.
		// 디비 코드를 자바에서 처리.
		// 로그 데이터를 자바에서 처리.
		
		//랜덤넘버 = Math.floor(Math.random()*10) + 1 ; //기억하기.
		
		
		
		

	}

	
	
}
