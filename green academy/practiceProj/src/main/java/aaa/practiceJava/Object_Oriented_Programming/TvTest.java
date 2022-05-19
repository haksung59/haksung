package aaa.practiceJava.Object_Oriented_Programming;

import java.util.Scanner;

class Tv {
	
	String color;
	boolean power;
	int channel;
	
	Tv(){}
	
	void power() {
		power = !power;
	}
	void ChannelUp() {
		++channel;
	}
	void ChannelDown() {
		--channel;
	}

}

class TvTest {
	public static void main(String args[]) {
		
		Tv t = new Tv();
		
		System.out.println("tv를 키시겠습니까?(1:yes, 2:no)");
		Scanner sc = new Scanner(System.in);
		int on = sc.nextInt();
		
		if(on==1) {
			t.power();
		}
		
		while(t.power) {

			System.out.println("1:채널 올리기, 2:채널 내리기, 3:끄기");
			int input = sc.nextInt();
			switch(input) {
			case 1: t.ChannelUp(); System.out.println("현재 채널 : " + t.channel);	break;
			case 2: t.ChannelDown(); System.out.println("현재 채널 : " + t.channel); break;
			case 3: t.power(); System.out.println("TV를 끕니다");
			}
			
		}
		
	}
}
