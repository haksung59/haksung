package com.hk.app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

// 도서관리하는 클래스 - 추가, 목록, 검색 등등 할 수 있음
public class BookManager {

	HashMap<String, Book> book_dic = new HashMap<String, Book>();
	Scanner sc = new Scanner(System.in);
	//첫번째 String 고유한 문자열 - 키값으로 사용하기 바랍니다.
	public int selectMenu() throws IOException {
		// 1.추가 2.목록 0.종료
		System.out.println("1:추가 2:도서 목록  0:종료");
		int key = sc.nextInt();
		if(key == 1) {
			add();
		}else if(key == 2) {
			list();
		}
		return key;
	}
	
	public void add() throws IOException {
		// 도서를 추가
		System.out.print("추가할 도서의 번호 13자리를 입력하시오.('-' 포함하여 입력)");
		String isbn = sc.next();
		String[] isbneach = isbn.split("");
		while(isbneach.length != 17 ) {
			System.out.print("도서 번호가 틀렸습니다. 다시 입력하시오.");
			isbn = sc.next();
			isbneach = isbn.split("");
			if(isbneach.length == 17) {
				break;
			}
		}
		System.out.print("제목을 입력하시오.");
		String title= sc.next();
		System.out.print("가격을 입력하시오.");
		int price = sc.nextInt();
		
		Book addbook = new Book(isbn, title, price);
		
		selectMenu();
	}
	
	public void list() {
		//도서목록 출력
		System.out.println("\t isbn \t\t title \t price");
		Book.print();
	}

	
}
