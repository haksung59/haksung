package com.hk.java;

public class StudentVo {
	
	//속성정의
	int id;
	String name;
	
	//기능정의
	public void setId(int no) {	// 변경
		System.out.println(name);
	}

	public void setName(String nm) {	// 변경
		System.out.println(id);
	}
	
	public int getId() { // 가져오기
		return id;
	}
	
	public String getName() { // 가졍오기
		return name;
	}
	
}
