package com.hk.app.test;

import java.util.ArrayList;
import java.util.List;

public class Exam070 {

	public static void main(String[] args) {
		// ArrayList에 담긴 값들 중 중복된 값 제거하여 출력하시오.
		// ArrayList에 담긴 12 50 12 25 60 있을 경우 12라는 값은 중복을 제거
		// 12 50 25 60 이라고 출력하시오.
		
		List num = new ArrayList();
		
		num.add(12); num.add(50);
		num.add(12); num.add(25); num.add(60);
		
		int temp = 0;
		
		for(int i=0; i<num.size(); i++) {
			for(int j=i+1; j<num.size(); j++) {
				if(num.get(i)==num.get(j)) {
					temp = j;
				}
			}
		}
		
		num.remove(temp);
		
		for(int i=0; i<num.size(); i++) {
			System.out.println(num.get(i));
		}
	}

}
