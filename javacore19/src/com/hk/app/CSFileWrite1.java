package com.hk.app;

import java.io.*;

public class CSFileWrite1 {

	public static void main(String[] args) {
		
		String workpath = System.getProperty("user.dir");
		String savefile = "\\src\\text\\csoutput.txt";
		
		String txt = "파일스트림을 이용하여 문자를 저장합니다";
		
		try {
			FileWriter fw = new FileWriter(workpath+savefile);
			fw.write(txt);
			fw.flush();//버퍼에 있는 데이터 비움
			
			fw.close();
			
			System.out.println("문자스트림으로 저장완료");
			
		} catch (Exception e) {
			
		}finally {
			
		}

	}

}
