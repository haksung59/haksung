package com.hk.app;

import java.io.*;

public class CSFileRead1 {

	public static void main(String[] args) throws IOException {
		
		String workpath = System.getProperty("user.dir");
		String readfile = "\\src\\text\\csoutput.txt";
		String result = new String();
		
		FileReader fr = new FileReader(workpath + readfile);
		int data = 0;
		while((data=fr.read()) !=-1) {
			result = result + (char)data;
		}
		
		System.out.println(result);
		
		fr.close();

	}

}
