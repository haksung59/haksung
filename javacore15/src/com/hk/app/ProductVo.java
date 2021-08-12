package com.hk.app;

//쇼핑몰 상품 정의하는 클래스
public class ProductVo {
	
	int serialNo;
	String name;
	int price;
	
	// 생성자로 초기화하기
	public ProductVo(int sN, String nM, int p) {
		serialNo = sN;
		name=nM;
		price = p;
	}
	
}
