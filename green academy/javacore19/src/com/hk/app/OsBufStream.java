package com.hk.app;

import java.io.*;

public class OsBufStream {

	public static void main(String[] args) throws IOException{
		
		String workpath = System.getProperty("user.dir");
		String filename = "\\src\\text\\boutput.txt";
		// 텍스트를 파일에 저장하기 위해서
		FileOutputStream fos = new FileOutputStream(workpath + filename);
		//보조스트림 : 기반 메인 스트림 필요함
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//저장할 데이터 정의
		String saveData = "자바를 이용하여 텍스트 파일을 저장합니다.";
		
		// 바이트 기반 : 문자열 --> 바이트 변환
		byte[] arr = saveData.getBytes(); // 문자열을 바이트 배열로.
		
		bos.write(arr);
		
		bos.close();
	}

}
