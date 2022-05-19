package com.hk.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exam3 {

	public static void main(String[] args) {
		
		//10~99 사이의 랜덤값을 10개를 만들어서
		List rand = new ArrayList();
		
		for(int i =0; i<10; i++) {
			rand.add((int)(Math.random()*90)+10);
		}
		//랜덤값을 합계를 구하시오. (단 Iterator를 사용해서)
		int sum = 0;
		int itrnum = 0;
		 Iterator itr = rand.iterator();
	      while(itr.hasNext() ) {   // 처음에는 아무것도 가리키지 않음 hasNext() 다음 데이터 있니?
			// 있으면 true
	    	  itrnum = (int)itr.next();
	    	  sum = sum + itrnum;
	    	  System.out.println(itrnum);
	      }
		System.out.println(sum);

	}

}
