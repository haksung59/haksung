package com.hk.app.test;

import java.util.Scanner;

public class Exam005 {

	public static void main(String[] args) {
		// 입력한 정수를 4로 나눠서 몫과 나머지를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int num = sc.nextInt();
		
		System.out.println("입력하신 정수를 4로 나눴을 때의 몫:"+num/4);
		System.out.println("입력하신 정수를 4로 나눴을 때의 나머지:"+num%4);
		

	}

}
