package aaa.practiceJava.Object_Oriented_Programming2;

import java.util.Scanner;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv(){
		super(100);
	}

	@Override
	public String toString() {
		return "Tv";
	}
	
}

class Computer extends Product {
	
	Computer(){
		super(200);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Computer";
	}
	
}

class Audio extends Product {
	Audio(){
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i=0;
	
	Buyer(int money){
		this.money = money;
	}
	
	void buy(Product p) {
		if(money <p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		item[i++] = p;
		System.out.println(p + "을/를 구매하셨습니다.");
		
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<item.length; i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		
		System.out.println("총 구매금액 : " + sum);
		System.out.println("남은 금액 : " + money);
		System.out.println("보너스 포인트 : " + bonusPoint);
		System.out.println("구매 제품 : " + itemList);
		
	}
	
	
}

public class PolyArgument {

	public static void main(String[] args) {
		
		System.out.print("현재 가지고 있는 금액을 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		Buyer b = new Buyer(money);
		
		boolean stop = true;
		
		while(stop) {
			
			System.out.println("구매하실 제품은?(1.Tv(100) 2.Computer(200) 3.Audio(50) 0.종료");
			sc = new Scanner(System.in);
			int buy = sc.nextInt();
			
			if(buy == 1) {
				b.buy(new Tv());
			}else if(buy ==2) {
				b.buy(new Computer());
			}else if(buy ==3) {
				b.buy(new Audio());
			}else if(buy ==0) {
				stop = false;
			}
			
			b.summary();
		}
	}

}
