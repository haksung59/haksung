package com.hk.app;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exam2 {

	public static void main(String[] args) {
		
		//오늘 날짜의 요일을 출력하시오.
		
		// 2문제 풀어보고 -> 4/12일 자바시험평가를 복습 바랍니다.
		
		Calendar cal = Calendar.getInstance();
		Date today = new Date(cal.getTimeInMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("E요일");
		System.out.println(sdf.format(today));

	}

}
