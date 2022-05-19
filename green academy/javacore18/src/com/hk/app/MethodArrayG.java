package com.hk.app;

public class MethodArrayG {
	
	// 제네릭으로 메소드를 사용한다면
	public static <T> T getLast(T[] input) {	// 매개변수 배열인데 타입을 제네릭 정의
		
		return input[input.length-1]; //배열의 마지막 값을 가져온다.
	}
	
	//메인함수
	public static void main(String[] args) {
		
		String[] computer = {"윈도우노트북", "맥북", "리눅스"};		// 마지막 값을 가져오시오.
		String last = getLast(computer);		// 호출시 <String> 생략해도 데이터를 가져온다***
		System.out.println("마지막 배열값은 : "+last);
		
	}

}
