package com.hk.app;

import java.io.*;

public class FileInfo1 {

	public static void main(String[] args) {
		
		String workpath = System.getProperty("user.dir");
		String savefile = "\\src\\text\\csoutput.txt";
		
		File tf = new File(workpath+savefile);
		String tfname = tf.getName();
		System.out.println(tfname);
		
		int pos = tfname.lastIndexOf(".");
		System.out.println(pos);
		String tfext = tfname.substring(0,pos);
		System.out.println(tfext);
		String tfext2 = tfname.substring(pos+1);
		System.out.println(tfext2);

	}

}
