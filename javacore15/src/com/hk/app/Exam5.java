package com.hk.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exam5 {

	public static void main(String[] args) {
		
		// 전화번호를 저장한다.
		Map phone = new HashMap(); // 키, 값으로 저장.
		
		// 전화번호를 입력하시겠습니까?(y/n)? y
		
		// 이름입력>>홍길동
		// 전화번호입력>> 121-0202-0100
		// 전화번호가 입력되었습니다.
		
		// 전화번호를 입력하시겠습니까?(y/n)? n
		// 저장된 정보를 모두 출력합니다.
		// 홍길동: 121-0202-0100
		// ....
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("전화번호를 입력하시겠습니까?(y/n)");
			String question = sc.next();
			if(question.equals("y")) {
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("전화번호 : ");
				String num = sc.next();
				phone.put(name, num);
			}else if(question.equals("n")) {
				TreeMap tm = new TreeMap(phone);
				System.out.println("저장된 정보를 모두 출력합니다.");
				Iterator itr = tm.descendingKeySet().iterator();
				while(itr.hasNext()) {
					String key = (String)itr.next();
					String number = (String)tm.get(key);
					System.out.println(key+" : "+number);
				
				}
				break;
			}
		}

	}

}
