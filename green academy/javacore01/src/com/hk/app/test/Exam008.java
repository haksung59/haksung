package com.hk.app.test;

public class Exam008 {

	public static void main(String[] args) {
		// 알파벳을 한 개 저장하고 그게 모음인지 자음인지 출력
		
		String alphabet = "a";
		
		if (alphabet == "a" || alphabet == "e" || alphabet == "i" || alphabet == "o" || alphabet == "u" || alphabet == "w" || alphabet == "y") {
			System.out.println("알파벳("+alphabet+")은 모음입니다.");
		}else {
			System.out.println("알파벳("+alphabet+")은 자음입니다.");
		}
	
		char alph = 'c';
		String result = "";
		switch(alph) {
		case 'a':
			result = "모음";
			break;
		case 'b':
			result = "자음";
			break;
		case 'c':
			result = "자음";
			break;
		case 'd':
			result = "자음";
			break;
		case 'e':
			result = "모음";
			break;
		case 'f':
			result = "자음";
			break;
		case 'g':
			result = "자음";
			break;
		case 'h':
			result = "자음";
			break;
		case 'i':
			result = "모음";
			break;
		case 'j':
			result = "자음";
			break;
		case 'k':
			result = "자음";
			break;
		case 'l':
			result = "자음";
			break;
		case 'm':
			result = "자음";
			break;
		case 'n':
			result = "자음";
			break;
		case 'o':
			result = "모음";
			break;
		case 'p':
			result = "자음";
			break;
		case 'r':
			result = "자음";
			break;
		case 's':
			result = "자음";
			break;
		case 't':
			result = "자음";
			break;
		case 'u':
			result = "모음";
			break;
		case 'v':
			result = "자음";
			break;
		case 'w':
			result = "모음";
			break;
		case 'x':
			result = "자음";
			break;
		case 'y':
			result = "모음";
			break;
		case 'z':
			result = "자음";
			break;
		default:
			System.out.println("소문자로 입력하시오.");
			break;
		}
		
		System.out.println("알파벳("+alph+")은 "+result+"입니다.");

	}

}
