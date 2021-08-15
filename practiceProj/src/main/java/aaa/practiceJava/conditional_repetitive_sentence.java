package aaa.practiceJava;

import java.util.Date;
import java.util.Scanner;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class Conditional_Repetitive_Sentence {

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
		
		
		boolean rsp = false;	
		int usernum = 0;
		
		while(rsp==false) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("가위 바위 보!");
			String user = sc.nextLine();
		
			
			switch(user) {
			case "가위" : case "찌" : usernum = 1; rsp = true; break;
			case "바위" : case "묵" : usernum = 2; rsp = true; break;
			case "보" : case "빠" : case "보자기" : usernum = 3; rsp = true; break;
			default : System.out.println("가위(찌), 바위(묵), 보(빠) 중에 입력해 주세요."); break;
			
			}
		}
		
		int com = (int)(Math.random() * 3) +1;
		String strcom = "";
		switch(com) {
		case 1: strcom = "가위"; break;
		case 2: strcom = "바위"; break;
		case 3: strcom = "보";
		}
		
		switch(usernum-com) {
		case 2 : case -1 : System.out.println("com : " + strcom); System.out.println("당신이 졌습니다.");break;
		case 1 : case -2 : System.out.println("com : " + strcom); System.out.println("당신이 이겼습니다.");break;
		case 0 : System.out.println("com : " + strcom); System.out.println("비겼습니다.");
		}
		
		
		//반복문
		for(int i=1, j=10; i<=10;i++, j--) {
			System.out.printf("%d \t %d%n", i, j);
		}
		
		for(int i=0; i<5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		int result = 1;

		System.out.println("계산식을 입력하시오. (끝내기 : 0)");
		while(result!=0) {
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			input.replace(" ", "");
			String[] splitinput = input.split("");
			
			String op = "";
			int i_index = 0;

			int first = 0;
			int second = 0;
			for(int i=0; i<splitinput.length; i++) {
				if(splitinput[i].equals("+")||splitinput[i].equals("-")||splitinput[i].equals("*")||splitinput[i].equals("/")) {
					op = splitinput[i]; i_index = i;
					String temp1 = "";
					String temp2 = "";
					if(i_index!=0) {
						for(int j=0; j<i_index; j++) {
							temp1 += splitinput[j];
						}
						for(int j=i_index+1; j<splitinput.length; j++) {
							temp2 += splitinput[j];
						}
						first = Integer.parseInt(temp1);
						second = Integer.parseInt(temp2);
					}else {
						for(int j=1; j<splitinput.length; j++) {
							temp2 += splitinput[j];
						}
						first = result;
						second = Integer.parseInt(temp2);
					}
				}
			}
			
			switch(op) {
			case "+" : result = first + second; break;
			case "-" : result = first - second; break;
			case "*" : result = first * second; break;
			case "/" : result = first / second; break;
			}
			
			
			if(input.equals("0")) {
				System.out.println("계산 결과 : "+ result);
				System.out.println("계산기를 종료합니다.");
				result = 0;
			}else {
				System.out.print(" = "+result);
			}
			
		}
		
		int[] arr = {1,2,3,4,5};
		for(int tmp : arr) {
			System.out.println(tmp);
		}
		
	}

}
