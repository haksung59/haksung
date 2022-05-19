package com.hk.app;

import java.util.Scanner;

public class KeyInput3 {

	public static void main(String[] args) {
		// name 에 이름입력 저장
		// food 에 음식명입력 저장
		// name + food 합쳐서 출력
		
		Scanner input = new Scanner(System.in);
		System.out.print("당신의이름은:");
		String name = input.nextLine();
		
		System.out.println(name);
		
		System.out.print("좋아하는 음식은:");
		String food = input.nextLine();
		
		System.out.println(name +"은 " + food+"를 좋아한다.");
		
		
		
		
	}

}
