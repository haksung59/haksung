package com.hk.app;

import java.io.*;

public class Exam2 {

	public static void main(String[] args) throws IOException {
		
		String workpath = System.getProperty("user.dir");
		String filename = "\\src\\text\\text2.txt";
		String savefile = "\\src\\text\\output2.txt";
		
		System.out.println(workpath+filename);
		
		FileInputStream fis = new FileInputStream(workpath+filename);
		FileOutputStream fos = new FileOutputStream(workpath + savefile);
		//보조스트림
		//BufferedInputStream 와 BufferedOutStream 사용해서
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
	
		//text2.txt 읽어서
		byte[] readBuffer = new byte[1024];
		
		while(bis.read(readBuffer, 0, readBuffer.length)!=-1) {
			
			bos.write(readBuffer);
			
			System.out.println("파일 복사 완료");
		}
		bis.close();
		bos.close();	//보조스트림을 닫으면 메인기반스트림도 닫힌다.

		//output2.txt로 저장하시오.
		
		}

}
