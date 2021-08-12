package com.hk.app;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		// 삼항연산자를 사용하여 키보드로 입력한 값이 양수인지 음수인지를 출력하는 프로그램을 작성하시오.
		// 단, 0은 양수라고 가정한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하시오:");
		int input = sc.nextInt();
		
		String result = (input >= 0) ? "양수" : "음수" ;
		
		System.out.println("입력한 값은:"+result);
	}

}
