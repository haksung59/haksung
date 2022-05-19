package com.hk.app;

public class Exam2 {

	public static void main(String[] args) {
		
		//Book 클래스를 정의 - name
		//Dog -name, color
		//Vehicle-wheel, color, gear
		//watch - com, price,
		
		// javabk
		// mydog
		// sonata
		// omega    생성
		
		Book javabk = new Book();
		Dog mydog = new Dog();
		Vehicle sonata = new Vehicle();
		watch omega = new watch();
		
		javabk.name = "자바책";
		mydog.name = "세라"; mydog.color = 'w';
		sonata.wheel = 'A'; sonata.color= 'w'; sonata.gear='s';
		omega.com = 'r'; omega.price=3000;
		
		System.out.println(javabk.name);
		System.out.println(mydog.name+"-"+mydog.color);
		System.out.println(sonata.wheel+"-"+sonata.color+"-"+sonata.gear);
		System.out.println(omega.com+"-"+omega.price);
		

	}

}
