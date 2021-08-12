package com.hk.app;

import java.util.Vector;

public class ListVector3 {

	public static void main(String[] args) {
		
		// 상품이란 클래스로 제품을 정의
		ProductVo mouse = new ProductVo(1,"로지텍마우스",25000);
		ProductVo keyboard = new ProductVo(2,"HP키보드",40000);
		ProductVo notebook = new ProductVo(3,"맥북에어",1250000);
		//게터나 세터로 정보대입하거나 생성자로 초기화
		
		// 벡터에 쇼핑몰 상품데이터를 대입하시오.
		Vector mall = new Vector(3);
		mall.add(mouse);
		mall.add(keyboard);
		mall.add(notebook);
		
		// 전체목록을 출력하시오.
		for(int i=0; i<mall.size(); i++) {
			ProductVo temp = (ProductVo)mall.get(i);//클래스 형변환에서 임시저장
			System.out.println(temp.serialNo+","+ temp.name+","+temp.price);
		}

	}

}
