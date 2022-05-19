package com.hk.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exam1 {

	public static void main(String[] args) {
		
		//FileInputStream, FileOutStream 사용해서
		//text1.txt 파일의 텍스트를 읽어서
		//outout1.txt 파일에 기록하시오.
		
		FileOutputStream fos = null;
		
		String workPath = System.getProperty("user.dir");
		String filename = "\\src\\text\\text1.txt";
		
		String str = "Exam1 test";
		
		byte[] readBuf = new byte[1024];
		
		try {
			fos = new FileOutputStream(workPath + filename);
			readBuf = str.getBytes();
			fos.write(readBuf, 0, readBuf.length);
			System.out.println("파일로딩 성공");
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e2) {
			System.out.println("에러2 : "+e2.getMessage());
		}
		
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream(workPath + filename);
			
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
