package aaa.model;

import lombok.Data;

@Data
public class Member {

	String id,name, pw;

	
	
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", pw=" + pw + "]";
	}



	/**
	 * @param id
	 * @param name
	 * @param pw
	 */
	public Member(String id, String name, String pw) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
	}



	/**
	 * 
	 */
	public Member() {
		
	}



	/**
	 * @param id
	 * @param name
	 */
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	

	

	
	
	
}
