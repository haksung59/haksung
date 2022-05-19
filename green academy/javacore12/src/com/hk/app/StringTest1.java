package com.hk.app;

public class StringTest1 {

	//String 클래스의 메소드 테스트 예제
	public static void main(String[] args) {
		
		String str = "Java Programing!";
		// charAt 메소드 예제
		char ch = str.charAt(0);	// 맨 처음 문자를 가져오기, 인덱스값을 이용.
		System.out.println("str의 처음문자는: "+ch);
		
		char ch_last = str.charAt(str.length()-1);
		System.out.println(ch_last);
		
		System.out.println();
		
		String strHello = "Hello ";
		String strName = "Peter";
		String result = strHello.concat(strName);
		System.out.println("두개의 문자열을 합치면: "+ result);
		
		System.out.println();
		
		String strSrc = "Java Programing!";
		String strFind = "Program";
		boolean bFind= strSrc.contains(strFind);
		System.out.println("포함하고 있다면: " + bFind);
		
		System.out.println();
		
		//두개의 문자열이 같은지 비교할때는 == 대신 equals
		
		String strTest = "안녕하세요 자바프로그래밍& 자바커피";
		char chFind = '자';	// 몇번째 위치?
		int idx_begin = strTest.indexOf(chFind);
		System.out.println("'자' 자가 있는 위치는: "+ idx_begin);	// -1 d은 글자가 없다.
		// 여러개가 있는 경우에는 맨 처음 위치를 알려줌.
		int idx_end = strTest.lastIndexOf(chFind);// 뒤에서부터 찾을 때.
		System.out.println("'자' 자가 있는 위치는 : "+ idx_end);
		
		System.out.println();
		String strOrg = "자바 프로그래밍";
		// 자바-> 제이쿼리로 대치 하시오.
		String strRe = strOrg.replace("자바", "제이쿼리");
		System.out.println("바뀐 문자열은 : "+strRe);
		
		String strAnimal = "Rabbit,Grass,Wolf,Hunter";
		//각각을 분리해서 출력하시오.
		
		String[] any = strAnimal.split(",");
		System.out.println("분리된 결과: "+ any[3]);
		
		String strArr = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// XYZ를 추출하시오
		int posX = strArr.indexOf('X');
		String strXYZ = strArr.substring(posX);
		System.out.println("strXYZ = "+ strXYZ);
		
		int posA = strArr.indexOf('A');
		String strABC = strArr.substring(posA,posA+3);	//시작위치~끝까지 추출.
		System.out.println("strABC="+strABC);
		
		// 숫자를 문자로 변환.
		int score = 90;
		String strS = String.valueOf(score);
		String strToe = "989";
		int nToe = Integer.valueOf(strToe);
		System.out.println("두 수의 합은 : "+ (score+nToe));
		

	}

}
