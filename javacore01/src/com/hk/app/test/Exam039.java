package com.hk.app.test;

import java.util.Scanner;

public class Exam039 {

	public static void main(String[] args) {
		
		// N = ?(1~10) 5
		//1
		//22
		//333
		//4444
		//55555
		Scanner reader=new Scanner(System.in);
		System.out.println("1~10까지의 숫자중 하나를 입력하시오.");
		int N = reader.nextInt();
		
		for(int i=1; i<=N; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(i);
			}System.out.println();
		}
	}

}
