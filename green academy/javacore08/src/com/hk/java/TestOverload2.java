package com.hk.java;

public class TestOverload2 {

	public static void main(String[] args) {
		
		// ==================== -> = 문자를 20번 출력 => line()
		
		// ******************** -> * 문자를 20번 출력 => line('*')
		
		// -------------------- -> - 문자를 20번 출력 => line('-')
		
		// ++++++++++++++++++++ -> + 문자를 40번 출력=> line('+', 40)
		
		OverloadEx2 draw = new OverloadEx2();
		
		draw.line();
		
		draw.line('*');
		draw.line('-');
		
		draw.line('+',40);
	}

}
