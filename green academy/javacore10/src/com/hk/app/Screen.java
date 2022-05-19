package com.hk.app;

import java.io.IOException;

public class Screen {

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
