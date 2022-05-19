package com.hk.app;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormat2 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTimeInMillis());
		Date today = new Date(cal.getTimeInMillis());
		System.out.println(today.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		System.out.println(sdf.format(today));

	}

}
