package com.hk.app;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		// 정수를 입력해서 짝수이면 "입력한 정수는 짝수입니다"
		// 홀수이면 "입력한 정수는 홀수입니다"

		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오");
		int number = input.nextInt();
		
		if (number%2 ==0) {
			System.out.println("입력한 정수는 짝수입니다.");
		}else {
			System.out.println("입력한 정수는 홀수입니다.");
		}
		input.close();
	}

}
