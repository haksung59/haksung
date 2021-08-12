package com.hk.app;

public class ThrowMethod1 {

	public static void main(String[] args) throws Exception {
		
		method();
	}
	
	public static void method() throws Exception {
		method2();
	}
	
	//메소드2에 예외처리 넣기
	public static void method2() throws Exception {
		// 메소드 안에서 에러를 찾는 경우.
		// try catch 사용한다.
		try {
			throw new Exception();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//throw new Exception();	//강제적으로 에러 발생
	}
	
}
