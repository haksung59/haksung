package com.hk.app;

import java.util.Vector;

public class Exam1 {

	public static void main(String[] args) {
		
		PersonVo grandFa = new PersonVo("할아버지",80);
		PersonVo grandMo = new PersonVo("할머니",78);
		PersonVo Father = new PersonVo("아빠",57);
		PersonVo Mother = new PersonVo("엄마",53);
		PersonVo Me = new PersonVo("나",29);
		PersonVo youngerBro = new PersonVo("남동생",27);
		
		Vector family = new Vector();
		
		//가족의 정보를 반복문으로 출력하시오.
		family.add(grandFa);
		family.add(grandMo);
		family.add(Father);
		family.add(Mother);
		family.add(Me);
		family.add(youngerBro);
		
		for(int i=0; i<family.size(); i++) {
			PersonVo temp = (PersonVo)family.get(i);
			System.out.println(temp.name +" "+ temp.age+"세");
		}
		
		//가족의 평균나이를 계산해서 출력하시오.
		int sum = 0;
		for(int i=0; i<family.size(); i++) {
			PersonVo temp = (PersonVo)family.get(i);
			sum = sum+temp.age;
		}
		int avg = sum/ family.size();
		System.out.println("평균나이 : "+avg+"세");
	}

}
