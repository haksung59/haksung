package project1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		String num = "0123456789";
		
		String[] random = num.split("");
		
		for(int i=0; i<1000; i++) {
			int n = (int)Math.floor(Math.random()*10);
			String temp = random[0];
			random[0] = random[n];
			random[n] = temp;
		}
		if(random[0].equals("0")) {
			random[0]=random[4];
		}
		
		String n = "";
		for(int i=0; i<3; i++) {	
			n += random[i];
		}
		int com = Integer.parseInt(n);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("123 ~ 987 사이의 숫자를 입력하세요 : ");
		int user = sc.nextInt();
		
		for(int i=0; i<1000; i++) {
			if(user/100<1 || user>=1000) {
				i--;
				System.out.print("세자리 숫자를 입력하세요 : ");
				user = sc.nextInt();
			}else if(user/100==(user/10)%10 || user/100==user%10 || (user/10)%10==user%10) {
				i--;
				System.out.print("중복되지 않은 숫자를 입력하세요 : ");
				user = sc.nextInt();
			}else if (user>com) {
				System.out.print("Down");
				user = sc.nextInt();
			}else if (user<com) {
				System.out.print("Up");
				user = sc.nextInt();
			}else {
				System.out.println((i+1)+"번 만에 정답을 맞추셨습니다.");
				break;
			}
		}
		

	}

}
