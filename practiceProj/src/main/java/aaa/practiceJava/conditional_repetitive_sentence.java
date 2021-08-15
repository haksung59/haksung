package aaa.practiceJava;

import java.util.Date;
import java.util.Scanner;

public class conditional_repetitive_sentence {

	public static void main(String[] args) {
		
		//switch
		int level = 0;
		while(level!=1&&level!=2&&level!=3) {
			Scanner sc = new Scanner(System.in);
			System.out.println("level을 입력하시오.");
			level = sc.nextInt();
			
			switch(level) {
			case 1 : System.out.println("레벨 1"); break;
			case 2 : System.out.println("레벨 2"); break;
			case 3 : System.out.println("레벨 3"); break;
			default : System.out.println("1~3까지의 숫자만 입력하시오.");
			}
		}
		
		Date date = new Date();
		
		int month = date.getMonth()+1;
		
		switch(month) {
		case 1: case 2: case 12: System.out.println("겨울");break;
		case 3: case 4: case 5: System.out.println("봄");break;
		case 6: case 7: case 8: System.out.println("여름");break;
		case 9: case 10: case 11: System.out.println("가울");break;
		}
		
	}

}
