package com.hk.app.test;

public class Exam055 {

	public static void main(String[] args) {
		
		//입력한 문자열에서 공백등 whitespace를 제거하시오
		//키보드입력: 안녕 방가워요 홍선생님
		//공백을 제거해서 출력하시오.
		
		String input = "안녕 방가워요 홍선생님";
		String[] each = input.split("");
		
		for(int i=0; i<each.length; i++) {
			if(each[i].equals(" ")) {
				each[i]="";
			}
			System.out.print(each[i]);
		}

	}

}
