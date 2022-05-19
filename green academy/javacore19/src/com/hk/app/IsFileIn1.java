package com.hk.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IsFileIn1 {

	public static void main(String[] args) {
		
		FileInputStream fin = null;
		
		String workPath = System.getProperty("user.dir");
		String filename = "\\src\\text\\foutput.txt";
		
		try {
			fin = new FileInputStream(workPath + filename);
			byte[] readBuf = new byte[fin.available()];	//파일사이즈
			
			int data = 0;
			
			data = fin.read(readBuf);
			System.out.println(new String(readBuf));
			
			
			fin.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (Exception e2) {
			
			e2.printStackTrace();
		}

	}

}
