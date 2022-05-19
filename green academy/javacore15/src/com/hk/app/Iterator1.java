package com.hk.app;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
	
	public static void main(String[] args) {
		
		// 동적 배열
	      ArrayList mylist = new ArrayList();
	      mylist.add(10);
	      mylist.add(20);
	      mylist.add(30);
	      
	      Iterator itr = mylist.iterator();
	      while(itr.hasNext() ) {   // 처음에는 아무것도 가리키지 않음 hasNext() 다음 데이터 있니?
	         // 있으면 true
	         System.out.println(itr.next());
	         
	      }
	}

}
