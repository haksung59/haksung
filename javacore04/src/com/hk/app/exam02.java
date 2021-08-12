package com.hk.app;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오");
		int num = sc.nextInt();
		
		switch (num%3) {
		
		case 0 :
			System.out.println("3의 배수이다");
			break;
		default:
			System.out.println("3의 배수가 아니다");
			break;
		}
		
		// 램덤한 숫자 1~10까지 발생 -> int com 저장
		// 내가 입력한 값 1~10까지 int me 저장
		// 두수가 같으면 "당신은 랜덤한 숫자(?)를 맞추었습니다."
		// 두 수가 같지 않으면 "당신은 랜덤한 숫자(?)를 맞추지 못했습니다."
		
		int com = (int)(Math.random() * 10)+1 ;
		System.out.print("1~10 숫자 중 하나를 입력하시오");
		int me = sc.nextInt();

		if (com == me) {
			System.out.println("당신은 랜덤한 숫자("+com+")를 맞추었습니다.");
		}else System.out.println("당신은 랜덤한 숫자 ("+com+")를 맞추지 못했습니다.");
		
		
	}

}
