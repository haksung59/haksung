package com.hk.app;

public class TestString {

	public static void main(String[] args) {
		
		// 1번: String 참조변수에 문자열을 대입하는 경우.
		String str1 = "안녕하세요";	//문자들을 배열로 저장하는 클래스.
		String str2 = "안녕하세요";
		if(str1 == str2) {
			System.out.println("참조변수의 주소는 같습니다.");
		}

		String str3 = "안녕하세요";				// 주소값을 대입함.
		String str4 = new String("안녕하세요");	// 참조변수를 새로운 주소값을 만들고 생성하고 생성자로 초기화
		if(str3 == str4) {
			System.out.println("참조변수의 주소는 같습니다.");
		}else {
			System.out.println("참조변수의 주소는 다릅니다.");
		}
		
		//	결론 : 문자열 자체를 비교하고 싶은 경우
		if(str1!=null && str1.equals(str2)) {
			System.out.println("참조변수의 문자열은 같습니다.");
		}if(str3.equals(str4)) {
			System.out.println("참조변수의 문자열은 같습니다.");
		}
	}

}
