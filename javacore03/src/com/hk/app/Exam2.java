package com.hk.app;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// 1파운드는 정확히 0.45359237kg.
		// 파운드를 kg로 변환하는 자바 프로그램을 만드시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파운드를 입력하시오");
		double input = sc.nextDouble();
		
		double Kg = input * 0.45359237;
		System.out.println(Kg);

	}

}
