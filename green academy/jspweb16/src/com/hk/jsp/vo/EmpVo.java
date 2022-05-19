package com.hk.jsp.vo;

//mysql - emp 테이블의 정보를 담는 클래스
public class EmpVo {
	
	// ctrl + shift + y : 대소문자 바꾸기
	private String id;
	private String name;
	private String passwd;
	private String designation;
	private String phone;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
