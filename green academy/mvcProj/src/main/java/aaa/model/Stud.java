package aaa.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class Stud {

	String pid, pname, up1, pw;
	int age;
	boolean marriage;
	
	
	public Stud() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Stud(String pid, String pname, String pw) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pw = pw;
	}
	public Stud(String pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	MultipartFile upfile1;
	MultipartFile upfile2;
	
}
