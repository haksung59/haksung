package com.hk.app;

import java.io.IOException;

public class Cmdmain {

	public static void main(String[] args) {
		
		int time = 100;
		
		
		
		for(time=100; time<=200; time++) {
			
			clearconsole();
		
			System.out.println("현재시간: "+time);	//cmd창에서 실행하기
			
		try {
			Thread.sleep(1000);		// 메인프로그램 1초동안 정지.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
	}
	
	public final static void clearconsole() {
		
		try {
			if(System.getProperty("os.name").contains("Windows")) {		//윈도우계열 플레폼
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}else {		//유닉스(맥), 리눅스(유닉스-free)
				Runtime.getRuntime().exec("clear");
			}
		} catch (IOException | InterruptedException ex) {
		}
	}

}

