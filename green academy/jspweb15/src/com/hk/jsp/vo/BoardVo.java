package com.hk.jsp.vo;

public class BoardVo {
	
	private int no;
	private String title;
	private String contents;
	private String write_id;
	private String write_name;
	private String regdate;
	private int votes;
	private int views;
	private String attatch1;
	private String attatch2;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWrite_id() {
		return write_id;
	}
	public void setWrite_id(String write_id) {
		this.write_id = write_id;
	}
	public String getWrite_name() {
		return write_name;
	}
	public void setWrite_name(String write_name) {
		this.write_name = write_name;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getAttatch1() {
		return attatch1;
	}
	public void setAttatch1(String attatch1) {
		this.attatch1 = attatch1;
	}
	public String getAttatch2() {
		return attatch2;
	}
	public void setAttatch2(String attatch2) {
		this.attatch2 = attatch2;
	}

}
