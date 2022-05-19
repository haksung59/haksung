package com.hk.app;

import java.io.*;

//도서정보를 관리하는 클래스
public class Book {
	//책정보 다음과 같음.
	String isbn;	//	978-3-16-148410-0 번호의 조합 - 의미를 나타내는 (국제 표준 도서 번호)
	String title;
	int price;
	
	//생성자
	public Book(String isbn, String title, int price) throws IOException {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		save();
	}
	//isbn을 가져오는 메소드
	public void save() throws IOException {
		BufferedWriter input = null;
		String workPath = System.getProperty("user.dir");
		String filename = "\\src\\text\\booklist.txt";
		
		input = new BufferedWriter(new FileWriter(workPath+filename,true));
		String line = isbn+"\t"+title+"\t"+price;
		input.write(line);
		input.newLine();
		
		input.close();
		
	}
	//정보를 출력하는 메소드
	public static void print() {
		FileInputStream fin = null;
		
		String workPath = System.getProperty("user.dir");
		String filename = "\\src\\text\\booklist.txt";
		
		try {
			fin = new FileInputStream(workPath + filename);
			byte[] readBuf = new byte[fin.available()];
			
			int data = 0;
			
			data = fin.read(readBuf);
			System.out.println(new String(readBuf));
			
			fin.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("에러 : "+e.getMessage());
		} catch(Exception e2) {
			System.out.println("에러 : "+e2.getMessage());
		}
	}



}
