package com.hk.app;

public class Try2 {

	public static void main(String[] args) {
		
		try {
			// 강제적으로 에러를 발생시킴
			Exception e = new Exception("에러내용:강제적으로 에러를 발생함.");
			throw e;
		}catch(Exception e2) {	//try catch 의해서 에러를 출력
			System.out.println("에러메세지 출력 : "+ e2.getMessage());
			e2.printStackTrace();
		}
		
		System.out.println("프로그램 종료됨");

	}

}
