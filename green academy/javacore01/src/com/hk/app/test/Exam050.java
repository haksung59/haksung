package com.hk.app.test;

import java.util.Scanner;

public class Exam050 {

	public static void main(String[] args) {
		
		// 문자열에서 모음, 자음, 숫자, 공백의 갯수를 출력하시오.
		String str = "Hello I was born in 1993";
		
		String[] word = str.split("");
		
		int vowel = 0;
		int cons = 0;
		int num = 0;
		int blank = 0;
		
		char[] chword = str.toCharArray();
		
		for(int i=0; i<chword.length; i++) {
			switch(chword[i]) {
			case ('a') : vowel++;continue;
			case ('e') : vowel++;continue;
			case ('i') : vowel++;continue;
			case ('I') : vowel++;continue;
			case ('o') : vowel++;continue;
			case ('u') : vowel++;continue;
			case (' ') : blank++;continue;
			case ('1') : num++;continue;
			case ('2') : num++;continue;
			case ('3') : num++;continue;
			case ('4') : num++;continue;
			case ('5') : num++;continue;
			case ('6') : num++;continue;
			case ('7') : num++;continue;
			case ('8') : num++;continue;
			case ('9') : num++;continue;
			case ('0') : num++;continue;
			default : cons++;continue;
			

			}
		}
		
		System.out.println("자음 : "+cons+"개");
		System.out.println("모음 : "+vowel+"개");
		System.out.println("숫자 : "+num +"개");
		System.out.println("공백 : "+blank+"개");

	}

}
