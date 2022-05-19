package com.hk.app;

import java.util.Scanner;

public class Machine1 {

	public static void main(String[] args) {
		
		
		Scanner reader = new Scanner(System.in);
		System.out.println("안녕하세요. 금액을 넣고 메뉴를 선택해 주세요.");
		System.out.print("투입금액 : ");
		int inMoney = 0;
		int chargeMoney = 0;
		int selectMenu = 0;
		int plus = 0;
		
		inMoney = reader.nextInt();
		chargeMoney += inMoney;
		
		
		while(true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1.콜라 (1000원)");
			System.out.println("2.사이다 (1000원)");
			System.out.println("3.한라봉(1500원)");
			System.out.println("4.밀키스(1300원)");
			System.out.println("5.마운틴듀(1500원)");
			System.out.println("6.취소");
			System.out.println("투입금액 : "+chargeMoney);
			selectMenu = reader.nextInt();
			
			if(selectMenu>=7) {
				System.out.println("메뉴를 다시 선택해주세요.");
			}else if(selectMenu!=6) {
				drink(selectMenu, chargeMoney);
				if((selectMenu==1 || selectMenu==2) && chargeMoney<coke) {
					plus = reader.nextInt();
					chargeMoney+= plus;
				}else if((selectMenu==3 || selectMenu==5) && chargeMoney<hallabong) {
					plus = reader.nextInt();
					chargeMoney+= plus;
				}else if(selectMenu==4 && chargeMoney<milkis) {
					plus = reader.nextInt();
					chargeMoney+= plus;
				}else if (selectMenu==1 || selectMenu==2) {
					chargeMoney -= coke;
				}else if (selectMenu==3 || selectMenu==5) {
					chargeMoney -= hallabong;
				}else if (selectMenu ==4) {
					chargeMoney -= milkis;
				}
			}else {
				cancle(chargeMoney);
				break;
			}
		}

	}
	final static int coke = 1000;
	final static int cider = 1000;
	final static int hallabong = 1500;
	final static int milkis = 1300;
	final static int mountain = 1500;
	
	public static void drink(int menu, int money) {
		
		switch(menu) {
		case 1: if(money<coke) {
			System.out.println("잔액이 "+(coke-money)+"원 부족합니다. 추가 금액을 투입해주세요.");
			System.out.println();
			
			}else {
				System.out.println("콜라 맛있게 드세요. 감사합니다.");
				System.out.println();
			}
		break;
		case 2: if(money<cider) {
			System.out.println("잔액이 "+(cider-money)+"원 부족합니다. 추가 금액을 투입해주세요.");
			System.out.println();
			}else {
				System.out.println("사이다 맛있게 드세요. 감사합니다.");
				System.out.println();
			}
		break;
		case 3: if(money<hallabong) {
			System.out.println("잔액이 "+(hallabong-money)+"원 부족합니다. 추가 금액을 투입해주세요.");
			System.out.println();
			}else {
				System.out.println("한라봉 맛있게 드세요. 감사합니다.");
				System.out.println();
			}
		break;
		case 4: if(money<milkis) {
			System.out.println("잔액이 "+(milkis-money)+"원 부족합니다. 추가 금액을 투입해주세요.");
			System.out.println();
			}else {
				System.out.println("밀키스 맛있게 드세요. 감사합니다.");
				System.out.println();
			}
		break;
		case 5: if(money<mountain) {
			System.out.println("잔액이 "+(mountain-money)+"원 부족합니다. 추가 금액을 투입해주세요.");
			System.out.println();
			}else {
				System.out.println("마운틴듀 맛있게 드세요. 감사합니다.");
				System.out.println();
			}
		break;
		default:
		
		}
	}
	
	public static void cancle(int chargeMoney) {
		if(chargeMoney>0) {
			System.out.println("잔돈 "+chargeMoney+"원을 반환합니다.");
		}
		System.out.println("자판기를 종료합니다.");
	}

}
