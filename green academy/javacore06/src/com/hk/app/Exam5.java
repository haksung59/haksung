package com.hk.app;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		
		
		String[] input = new String[5];
		//키보드로 입력을 5개 받는다.
		//1, 3, 5째 문자만 출력하시오.
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<input.length; i++) {
			System.out.print("문자"+(i+1)+"을(를) 입력하시오.");
			input[i] = sc.next();
			
		}System.out.print(input[0]+" "+input[2]+" "+input[4]);

	}

}
