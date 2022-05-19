package com.hk.app;

public class Exam2 {

	public static void main(String[] args) {
		
		BurgerSelf bKing = new BurgerSelf(true);
		BurgerSelf bKing2 = new BurgerSelf();
		
		//bKing 세트메뉴로 구입을 했더니
		// 가격이 7000원. & 사이드메뉴 포테이토, 드링크 오렌지주스.
		
		// bKing 단품으로 구입을 했더니
		// 가격이 6000원. & 사이드,드링크 없음.
		
		bKing.setPrice(6000);
		bKing2.setPrice(6000);
		
		
	}

}
