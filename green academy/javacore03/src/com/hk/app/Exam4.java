package com.hk.app;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		// 할인점에서 하나에 100,000원인 제품을 판매한다. 그 제품을 10개 이상 사는 고객에게는 10%를 할인해 준다.
		// 고객이 구입한 그 제품 수량을 입력하면 총 가격을 계산하는 프로그램
		
		int goods = 100000;
		Scanner num = new Scanner(System.in);
		System.out.print("구매하실 제품 수량을 입력하시오:");
		int input = num.nextInt();
		
		int price = input * goods;
		
		int saleprice = (input >= 10) ? price-price/10 : price;
		
		System.out.println("구매하신 제품들의 총 금액은 " + saleprice + "원 입니다.");

	}

}
