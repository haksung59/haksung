package jsonProj;

import java.text.SimpleDateFormat;
import java.util.Date;


public class BoardVO {

	String title, pname, content, pw;
	
	Integer no;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "BoardVO [title=" + title + ", pname=" + pname + ", content=" + content + ", pw=" + pw + ", no=" + no
				+ "]";
	}
	
}