package com.hk.app.test;

import java.io.*;

public class Exam072 {

	public static void main(String[] args) throws IOException {
		// 텍스트파일 text072.txt 파일에서 가져온 문자열을 출력하시오(FileReader)
		// "안녕하세요 mysql 데이터베이스 프로그래밍입니다."
		
		String workpath = System.getProperty("user.dir");
		String readfile = "\\src\\text\\text072.txt";
		String result = new String();
		
		FileReader fr = new FileReader(workpath + readfile);
		int data = 0;
		while((data=fr.read()) != -1) {
			result += (char)data;
		}
		System.out.println(result);
		
		fr.close();
		

	}

}
