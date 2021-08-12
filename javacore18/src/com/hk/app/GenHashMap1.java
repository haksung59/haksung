package com.hk.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class GenHashMap1 {

	public static void main(String[] args) {
		
		//HashMap dictionary = new HashMap(); // 영어단어 : 한글 매핑(String, String)
		//제네릭을 사용하면
		HashMap<String, String> dictionary = new HashMap<String, String>();	//키와 값이 문자열
		
		//데이터입력
		dictionary.put("water", "물");
		dictionary.put("lion", "사자");
		dictionary.put("apple", "사과");
		dictionary.put("monkey", "원숭이");
		
		//출력
		Set<String> keys = dictionary.keySet(); //먼저 키값을 가져온다.
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			String val = dictionary.get(key);	//반환시 원래 형변환하는데 그 부분이 생략
			System.out.println("키:"+key+" / 값:"+val);
		}
		
		//검색
		Scanner reader = new Scanner(System.in);
		System.out.print("검색할 단어를 입력하시오 : ");
		String word = reader.next();
		System.out.println("검색결과 : "+ dictionary.get(word));

	}

}
