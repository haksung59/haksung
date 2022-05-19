package com.hk.app;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		
		String[] student = {"이천수","박지성","유상철","황선홍","이을용",
							"취태욱","홍명보","김진철","김건우","이기선"};
		
		// name 입력을 받고
		// 그 이름이 배열에서 몇번째에 있는지 출력하시오.
		
		Scanner reader = new Scanner(System.in);
		System.out.println("이름을 입력하시오.");
		String name = reader.next();
		
		for(int i=0; i<student.length; i++) {
			if( name.equals(student[i])) {
				System.out.println(name+"은 "+(i+1)+"번째에 있습니다.");
				break;
			}else if(i>= student.length-1) {
				System.out.println("입력하신 이름은 명단에 없습니다.");
			}
		}
		
		
	}

}
