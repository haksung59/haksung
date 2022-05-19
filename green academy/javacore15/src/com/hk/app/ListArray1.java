package com.hk.app;

import java.util.ArrayList;	//jdk제공

public class ListArray1 {

	public static void main(String[] args) {
		
		//정적배열
		int[] scores = new int[10]; // 갯수가 고정.
		scores[0] = 10;
		int length = scores.length;
		//동적배열
		ArrayList mylist = new ArrayList();
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		// 특정인덱스에 데이터 추가
		mylist.add(0, 40);		//가변기능 >> 밀어내기
		mylist.set(3, 30*2);	// 삽입가능
		mylist.remove(0);		// 제거가능 >> 뒤는 당겨옴
		int size = mylist.size();
		
		for(int i=0; i<size; i++) {
			int temp = (int)mylist.get(i);
			System.out.println(i+" "+temp);
		}

	}

}
