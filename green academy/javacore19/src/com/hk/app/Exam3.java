package com.hk.app;

import java.io.*;

public class Exam3 {

	public static void main(String[] args) throws IOException {
		
		//FileReader, FileWriter 클래스 사용해서
		String workpath = System.getProperty("user.dir");
		
		String readfile = "\\src\\text\\text3.txt";
		String savefile = "\\src\\text\\output3.txt";
		
		String result = new String();
		//text3.txt 읽고
		FileReader fr = new FileReader(workpath + readfile);
		
		//output3.txt로 저장하시오
		int data=0;
		
		while((data=fr.read())!=-1) {
			
			result = result + (char)data;
			
		}
		FileWriter fw = new FileWriter(workpath + savefile);
		fw.write(savefile);
		fw.flush();
		
		fw.close();
		
		System.out.println(result);
		
		fr.close();

	}

}
