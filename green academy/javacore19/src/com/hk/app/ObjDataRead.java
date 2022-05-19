package com.hk.app;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;

public class ObjDataRead {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String workpath = System.getProperty("user.dir");
		String savefile = "\\src\\text\\userdata.ser";	//ser 는 직렬화데이터라고 정의함.
		FileInputStream fis = new FileInputStream(workpath+savefile);
		
		//보조 스트림
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object result = ois.readObject();	//객체가 정의되지 않을 수 있어서 예외처리 추가
		
		HashMap output = (HashMap)result;
		
		Iterator<String> itr = output.keySet().iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			String val = (String)output.get(key);
			System.out.println("key:"+ key + ">>"+"value:"+val);
		}

	}

}
