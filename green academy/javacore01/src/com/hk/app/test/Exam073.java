package com.hk.app.test;

import java.io.*;

public class Exam073 {

	public static void main(String[] args) {
		// 기존의 파일 text073.txt 기존파일에 텍스트를 추가하여 저장하시오(FileWriter)
		// "안녕하세요 자바프로그래밍" + "임의의 문자열"
		
		String workpath = System.getProperty("user.dir");
		String savefile = "\\src\\text\\text073.txt";
		
		String origin = new String();
		String txt = "개발자 김학성입니다.";
		
		try {
			FileReader fr = new FileReader(workpath+savefile);
			int data = 0;
			while((data=fr.read()) !=-1) {
				origin += (char)data;
			}
			FileWriter fw = new FileWriter(workpath+savefile);
			fw.write(origin + txt);
			fw.flush();
			
			fr.close();
			fw.close();
			
		}catch (Exception e) {
			
		}

	}

}
