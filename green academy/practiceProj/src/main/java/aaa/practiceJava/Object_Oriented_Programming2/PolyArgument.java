package aaa.practiceJava.Object_Oriented_Programming2;

import java.util.Scanner;
import java.util.Vector;

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
	Vector item = new Vector();
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
		
		item.add(p);
		System.out.println(p + "을/를 구매하셨습니다.");
		
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? p : ", " + p;
		}
		
		System.out.println("총 구매금액 : " + sum);
		System.out.println("남은 금액 : " + money);
		System.out.println("보너스 포인트 : " + bonusPoint);
		System.out.println("구매 제품 : " + itemList);
		
	}
	
	void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		}else {
			System.out.println("해당 제품이 없습니다.");
		}
	}
	
}

public class PolyArgument {

	public static void main(String[] args) {
		
		System.out.print("현재 가지고 있는 금액을 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		Buyer b = new Buyer(money);
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		boolean stop = true;
		
		while(stop) {
			
			System.out.println("구매하실 제품은?(1.Tv(100) 2.Computer(200) 3.Audio(50) 4.환불하기 0.종료");
			sc = new Scanner(System.in);
			int buy = sc.nextInt();
			
			if(buy == 1) {
				b.buy(tv);
			}else if(buy ==2) {
				b.buy(com);
			}else if(buy ==3) {
				b.buy(audio);
			}else if(buy ==0) {
				stop = false;
			}else if(buy == 4) {
				System.out.println("환불하실 제품은? (1.Tv 2.Computer 3.Audio 4.환불 안함 0.종료)");
				buy = sc.nextInt();
				switch(buy) {
				case 1: b.refund(tv); break;
				case 2: b.refund(com); break;
				case 3: b.refund(audio); break;
				case 4: System.out.println("환불 하지 않습니다."); break;
				case 0: stop = true;
				}
			}
			
			b.summary();
		}
	}

}
