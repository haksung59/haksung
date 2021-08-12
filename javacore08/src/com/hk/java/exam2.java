package com.hk.java;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력하시오.");
		int input = sc.nextInt();
		
		int N=1;
		recurGugu(input, N);
		
	}
	public static void recurGugu(int dan, int depth) {
		// 재귀함수 - 구구단 출력
		if(depth>9) return;
		else {
			System.out.println(dan + "*" + depth + "=" + dan*depth);
			recurGugu(dan, depth+1);
		}

	}
}
