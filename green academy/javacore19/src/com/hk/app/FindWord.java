package com.hk.app;

import java.io.*;
import java.util.Scanner;

public class FindWord {

	public static void main(String[] args) throws IOException {
		
		// 메뉴입력을 받는 로직을 구성
		Scanner menu = new Scanner(System.in);
		String input = "";
		
		//파일경로 설정
		String workpath = System.getProperty("user.dir");
		String wordfile = "\\src\\text\\dataword.txt";
		
		//문자 보조 스트림 사용
		BufferedWriter out = null;
		BufferedReader in = null;
		BufferedReader in2 = null;
		
		// 입력 또는 검색위한 문자열 정의
		String word = "";
		
		while(true) {
			
			System.out.println("선택메뉴>>1.단어입력 2.단어검색 3.종료 :");
			System.out.print(">>");
			input = menu.next();
			
			//파일에 저장
			if(input.charAt(0)=='1') {
				System.out.println(">>영단어/뜻을 입력하시오.");
				//InputStreamReader : Scanner 유사함.(키보드읽기)
				InputStreamReader isr = new InputStreamReader(System.in);
				in = new BufferedReader(isr);
				word = in.readLine();
				
				//저장
				
				out = new BufferedWriter(new FileWriter(workpath+wordfile, true));
				out.write(word);
				out.newLine();
				
				out.close();
			}// 파일을 읽기
			else if(input.charAt(0)=='2') {
				System.out.println(">>검색할 단어를 입력하시오: ");
				InputStreamReader isr = new InputStreamReader(System.in);
				in = new BufferedReader(isr);
				word = in.readLine();
				
				in2 = new BufferedReader(new FileReader(workpath+wordfile));
				String line;
				// 검색결과 처리
				boolean isFind = false;
				while((line = in2.readLine()) != null) {
					String[] tokens = line.split("/");
					
					
					//대소문자 구분없이 같은지 비교
					if(tokens[0].trim().compareToIgnoreCase(word.trim())==0) {
						System.out.println(">>단어: "+tokens[0].trim());
						System.out.println(">>설명: "+tokens[1].trim());
						isFind = true; // 찾았을 경우
					}
				}
				if(isFind==false) {
					System.out.println(">>찾는 단어가 없습니다.");
				}
				
			}//
			else if(input.charAt(0)=='3') {
				System.out.println("종료합니다.");
				menu.close();
				break;
			}else {
				System.out.println("입력오류입니다.");
			}
		}

	}

}
