package com.hk.app;

import java.util.Vector;

public class ListVector2 {

	public static void main(String[] args) {
		
		//벡터를 선언하고
		
		// 좋아하는 음식 3개를 문자열로 동적배열 Vector에 대입.
		
		// 반복문으로 출력.
		
		Vector listFood = new Vector();
		
		listFood.add("짬뽕");
		listFood.add("초밥");
		listFood.add("비빔밥");
		
		for(int i=0; i<listFood.size(); i++) {
			System.out.println(i+"번째값 : "+listFood.get(i));
		}

	}

}
