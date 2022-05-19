package com.hk.app;

public class BurgerSelf extends FoodSelf{
	
	private boolean isSet;
	private String side; //사이드메뉴
	private String drink; // 음료
	
	//생성자를 통해서 설정 가능.
	public BurgerSelf() {
		isSet = false;
	}
	public BurgerSelf(boolean set) {
		isSet = set;
		side = "포테이토";
		drink = "오렌지쥬스";
	}
	
	//재정의
	public void setPrice(int price) {
		//가격을 재조정.
		if(isSet==true) {
			price = price + 1000;
			System.out.println("세트여부:o");
		}else {
			price = price;
			System.out.println("세트여부:x");
		}
		System.out.println("사이드메뉴:"+side+" / 음료:"+drink+" / 금액:"+price);
	}

}
