package com.hk.app;

import java.util.*;

public class ListVector1 {

	public static void main(String[] args) {
		
		Vector vc = new Vector();	//동적인 배열이 생성됨.
		// 동적배열 <==> 정적배열
		// 인덱스 가변적 < == > 인덱스 고정 int[] a = new int[10];//길이가 10으로 고정.
		
		// 벡터라는 동적배열은 클래스 이미 만들어져서 제공된 것이다.
		// a[0] = 100; 정적배열의 대입.
		vc.add(100); // 순서가 0번째 데이터 대입: add 메소드를 통해서
		//데이터 추가하기
		vc.add("java");		//1번
		vc.add("jsp");		//2번
		vc.add("spring");	//3번
		if(vc.contains("jsp")) {	// true 일반적인 배열은 반복을 찾는 반면
			System.out.println("jsp데이터가 있습니다."+vc.indexOf("jsp")+"번째 있습니다.");
		}
		System.out.println(vc.elementAt(2));	//2번째에 있는 데이터 확인
		
		// 지정된 위치에 데이터를 추가
		vc.set(2, "오라클");
		System.out.println(vc.toString());
		
		//정적배열로 전환
		String[] newArr = new String[4];
		////newArr = vc.toArray();	//반환타입 Objec 최상위 클래스
		for(int i=0; i<newArr.length; i++) {
			System.out.println(i+"번째 데이터는 "+newArr[i]);
		}
		
		vc.removeAllElements();
		//System.out.println("마지막의 데이터는 : "+ vc.get(3));
		if(vc.isEmpty() == true){
			System.out.println("배열을 모두 비웠습니다.");
		}

	}

}
