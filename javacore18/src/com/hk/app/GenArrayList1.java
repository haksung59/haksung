package com.hk.app;

import java.util.ArrayList;
import java.util.Iterator;

public class GenArrayList1 {

	public static void main(String[] args) {
		
		//String 제네릭 사용
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("안녕하세요");
		myList.add("제네릭테스트");
		myList.add("마지막입니다");
		
		// Integer 제네릭 사용
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(100);
		numList.add(200);
		
		// <클래스명> 제네릭 사용
		ArrayList<Product> proList = new ArrayList<Product>();
		proList.add(new Product("모니터",100000));
		proList.add(new Product("자전거", 200000));
		
		// 출력
		Iterator myItr = myList.iterator();
		while(myItr.hasNext()) {
			System.out.println(myItr.next());
		}
		
		Iterator<Product> proItr = proList.iterator();
		while(proItr.hasNext()) {
			Product temp = proItr.next(); //Product 타입
			System.out.println(temp.name + "의 가격은 : "+ temp.price);
		}

	}

}
