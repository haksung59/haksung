package com.hk.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IsFileOut1 {

	public static void main(String[] args) {
		
		//아웃 -> 저장
		FileOutputStream fos = null;
		
		String workPath = System.getProperty("user.dir");
		String filename = "\\src\\text\\foutput.txt";
		
		String str = "Hello world";
		// 바이트 단위 입출력
		byte[] readBuf = new byte[1024];
		
		try {
			fos = new FileOutputStream(workPath + filename);
			readBuf = str.getBytes();	// 스트링을 바이트 배열로 변환
			fos.write(readBuf, 0, readBuf.length);
			System.out.println("파일로딩 성공");
			fos.close();	//메모리 반환 필수
			
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("에러 : "+e.getMessage());
		} catch (Exception e2) {
			System.out.println("에러2 : "+e2.getMessage());
		}
		
	}

}
