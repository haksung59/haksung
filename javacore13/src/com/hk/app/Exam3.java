package com.hk.app;

import java.util.Calendar;
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		// 연도를 입력, 달 입력
		Scanner reader = new Scanner(System.in);
		System.out.print("연도를 입력하시오.");
		int year = reader.nextInt();
		System.out.print("월을 입력하시오.");
		int month = reader.nextInt();
		
		// 달력을 계산
		cal.set(Calendar.YEAR, year);		//연도변경
		cal.set(Calendar.MONTH, month-1);	// 월변경:달이 0부터 시작됨.
		cal.set(Calendar.DAY_OF_MONTH, 1);	// 일변경
		//cal.set(year, month-1, 1); 		//동시변경
		// 마지막날짜
		int end = cal.getActualMaximum(Calendar.DATE);
		// 시작요일
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);	//1:일 , 2:월, 5:목, 7:토
		
		// 달력을 출력하시오.
		System.out.println("======================="+ year +"년 "+ month+"월"+"======================");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("=====================================================");
		for(int i=1; i<dayOfWeek; i++) {
			System.out.print("★\t");
		}
		for(int i=0; i<end; i++) {
			if(dayOfWeek>7) {
				System.out.println();
				dayOfWeek = 1;
			}
			System.out.print((i+1)+"\t");
			
			dayOfWeek++;
		}
		for(int i=7; i>=dayOfWeek; i--) {
			System.out.print("★\t");
		}
		System.out.println();
		System.out.println("=====================================================");

	}

}
