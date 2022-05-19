package com.hk.app;

import java.util.Scanner;

public class Exam7teacher {

	public static void main(String[] args) {

			Scanner reader = new Scanner(System.in);
			int i=0;
			int total=0;
			while(true) {
				i++;
				System.out.println(i+"번째 손님의 요금은: ");
				int fare = reader.nextInt();
				total = total+fare;
				
				if(total>=120000)	{
					break;	//	총수입이 120000이상이면 stop
				}
			}
			System.out.println("오늘의 총 손님수: "+i);
			System.out.println("오늘의 총수입: "+total);
	}

}
