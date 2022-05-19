package com.hk.app;

import java.util.Arrays;

// 정렬에 적용가능, 인터페이스이므로 메소드 재정의 필요
public class PersonCompare implements Comparable<PersonCompare>{	//<>제네릭 (데이터 타입을 미리 정의)

	private String name;	// 이름 문자열
	private int age;		// 나이 숫자
	
	// 게터와 세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//생성자
	public PersonCompare(String nm, int a) {
		name = nm;
		age = a;
	}



	@Override
	public int compareTo(PersonCompare other) {
		
		//return this.age - other.age; //오름차순 (작은>>>큰)
		return other.age - this.age;	//내림차순
	}
	
	public String toString() {
		return "이름: "+ name + "\t 나이: "+age;
	}
	
	//main함수
	public static void main(String[] args){
		PersonCompare[] people = new PersonCompare[5]; 
				people[0] = new PersonCompare("윤호중" , 23);
				people[1] = new PersonCompare("김선호" , 28);
				people[2] = new PersonCompare("박선우" , 18);
				people[3] = new PersonCompare("오일권" , 43);
				people[4] = new PersonCompare("최필성" , 33);
				
				//printPeople(people);
				Arrays.sort(people);	// 정렬해주는 메소드 compareTo에 따라서
				printPeople(people);	// 기본-숫자를 통해 정렬
				
				System.out.println("-----------------------");
				Arrays.sort(people, new PersonComparator());
				printPeople(people);
	}

		// 출력함수
		public static void printPeople(PersonCompare[] people) {
			
			for(int i=0; i<people.length; i++) {
				System.out.println(people[i].toString());
			}
			
		}
}
