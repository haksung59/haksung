package com.hk.app;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] student = {"이천수","박지성","유상철","안정환", "황선홍",
							"최태욱","홍명보","김진철","김건우", "이기선"};
		
		// name하나를 입력을 받고 그 이름이 몇번째 배열에 있는지 출력하시오
		
		System.out.println("선수이름을 입력하세요");
		String name = sc.next();
		
		for(int i=0;i<student.length; i++) {
			
			if( name.equals(student[i]) ) { // == 을 쓰면 안됨
				System.out.println("입역하신 단어는 " + (i + 1) + "번째 칸에 있습니다." );
				break;
			}
			else if(i == student.length-1) {
				System.out.println("입력한 사람은 정보가 없습니다." );
			}
			
		}
		
		sc.close();
		
	}
}
