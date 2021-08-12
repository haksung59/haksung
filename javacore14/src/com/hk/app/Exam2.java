package com.hk.app;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) throws Exception{
		
		String str = null;
		//str = "안녕하세요 자바 Exception을 처리하는 코드입니다. 테스트";
		
		Scanner reader = new Scanner(System.in);
		System.out.println("문자를 입력하시오.");
		str = reader.next();
		try {
			checkLength(str);
		}catch(Exception e) {
			System.out.println("에러내용은 : "+e.getMessage());
		}
	}
	
	public static void checkLength(String instr) throws Exception{
		//길이를 구해서
		// 20개가 넘으면 Exception을 발생해서 : 문자길이가 20 이상입니다.
		// 공백이면  Exception을 발생해서 "null 문자열입니다."
		// 20개 이하면 정상적으로 문자를 출력하시오.
		if(instr.equals("")) {
			throw new Exception("null 문자열입니다.");
		}
		
		String[] splstr = instr.split("");
		
		for(int i =0; i<splstr.length; i++) {
			if(splstr.length>20) {
				throw new Exception("문자길이가 20 이상입니다.");
			}else {
				System.out.print(splstr[i]);
			}
		}
			
		
	}

}
