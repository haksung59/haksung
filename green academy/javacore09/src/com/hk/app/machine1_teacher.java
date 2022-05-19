package com.hk.app;

import java.util.Scanner;

public class machine1_teacher {

	public static void main(String[] args) {
		
		// 1-환영메시지 코드
		
		// 2-잔액표시
		
		// 3-금액을 입력하고 만약 잔액>0 이면 자판기를 시작
		
		// 4-입력금액 저장하고 구매할 메뉴를 출력한다.
		
		// 5-메뉴선택
		
		Scanner reader = new Scanner(System.in);
		int inMoney=0;
		int chargeMoney=0;
		int selectMenu = 0;
		
		System.out.println("*****************************************");
		System.out.println("****             음료수 자판기                          ****");
		System.out.println("*****************************************");
		System.out.print("***금액을 투입하세요:");
		inMoney=reader.nextInt();
		
		
		chargeMoney += inMoney;
		System.out.println("****잔액: "+chargeMoney);
		
		
		while(true) {
			System.out.println("*** 커피 메뉴입니다.");
			System.out.println("*** 1.코카콜라 500ml(1000원)");
			System.out.println("*** 2.제로콜라 500ml(900원)");
			System.out.println("*** 3.펩시 500ml(1000원)");
			System.out.println("*** 4.스프라이트 500ml(1200원)");
			System.out.println("*** 5.칠성사이다 500ml(1000원)");
			System.out.println("*** 6.취소");
			System.out.println("*** 메뉴를 선택하시오.");
			selectMenu = reader.nextInt();
			
			if(selectMenu!=6) {
				buyCoffee(selectMenu, chargeMoney);
			}else {
				System.out.println("*** 자판기를 종료합니다.");
				break;
			}
			//메뉴선택
			
		}

	}
	final static int coca500 = 1000;
	final static int zero500 = 900;
	final static int pepsi500 = 1000;
	final static int sprite500 = 1200;
	final static int sevenstar500 = 1000;
	
	
	// 구매처리에 대한 static 함수
	public static void buyCoffee(int menu, int charge) {
		// 5-1
		// 금액체크?
		// 금액을 더 넣으시오
		// 상품을 구매
		switch(menu) {
		case 1:
			if(charge-coca500<0) {
				System.out.println("잔액이 "+(coca500-charge)+"원 부족합니다.");
				System.out.println();
			}else {
				System.out.println("아메리카노 맛있게 드세요!!");
				System.out.println();
			}
			break;
		case 2:
			if(charge-zero500<0) {
				System.out.println("잔액이 "+(zero500-charge)+"원 부족합니다.");
				System.out.println();
			}else {
				System.out.println("카페라떼 맛있게 드세요!!");
				System.out.println();
			}
			break;
		case 3:
			if(charge-pepsi500<0) {
				System.out.println("잔액이 "+(pepsi500-charge)+"원 부족합니다.");
				System.out.println();
			}else {
				System.out.println("초코라떼 맛있게 드세요!!");
				System.out.println();
			}
			break;
		case 4:
			if(charge-sprite500<0) {
				System.out.println("잔액이 "+(sprite500-charge)+"원 부족합니다.");
				System.out.println();
			}else {
				System.out.println("초코라떼 맛있게 드세요!!");
				System.out.println();
			}
			break;
		case 5:
			if(charge-sevenstar500<0) {
				System.out.println("잔액이 "+(sevenstar500-charge)+"원 부족합니다.");
				System.out.println();
			}else {
				System.out.println("그린라떼 맛있게 드세요!!");
				System.out.println();
			}
			break;
		default:
			
		}
	}
	
	// 금액체크 함수

		// 5-1-1
	
	
	// 이런 순서대로 짜는 방법 = 절차지향 프로그래밍 <----> 객체지향 프로그래밍 (모듈화 필요하다면 클래스를 만들어서 분해)
	// (나중에)클래스 다이어그램 작성 -> 클래스 정의부분 -> 객체지향 프로그래밍
	//다음시간 - 스스로 자판기 순서도를 작성해보자.

}
