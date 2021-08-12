package com.hk.app.selftest;

public class BurgerSelf extends FoodSelf{
	
	boolean isSet;
	String side;
	String drink;
	
	public BurgerSelf() {
		isSet = false;
	}
	public BurgerSelf(boolean set) {
		isSet = set;
		side = "감자튀김";
		drink = "콜라";
	}
	public void setPrice() {
		if(isSet == true) {
			price = price+1000;
			System.out.println("세트여부 : o");
			System.out.println("사이드메뉴 : "+side+" / 음료 : "+drink);
			System.out.println("금액 : "+price);
		}else{
			System.out.println("세트여부:x");
			System.out.println("사이드메뉴 : "+side+" / 음료 : "+drink);
			System.out.println("금액 : "+price);
		}
	}
	public void setName(String name) {
		if(name == "불고기버거") {
			price = 5000;
			System.out.println("<불고기버거>");
			setPrice();
		}else if(name == "새우버거") {
			price = 4500;
			System.out.println("<새우버거>");
			setPrice();
		}
	}
	
	

}
