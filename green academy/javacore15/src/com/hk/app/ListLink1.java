package com.hk.app;

import java.util.LinkedList;
import java.util.List;

public class ListLink1 {

	public static void main(String[] args) {
		
		List myLink = new LinkedList();
		myLink.add(23);
		myLink.add(34);
		myLink.add(19);
		
		// 맨앞에 추가.
		myLink.add(0, 15);
		
		// 맨 마지막에 추가
		myLink.add(4, 25);
		
		//중간데이터 삭제
		myLink.remove(2); //장점
		
		myLink.add(2, 45);
		
		int size = myLink.size();
		
		for(int i=0; i<size; i++) {
			System.out.println(myLink.get(i));
		}
		

	}

}
