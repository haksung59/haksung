package aaa.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {

	String title, pname, content, upfile, pw, sch;
	
	Integer no, cnt, gno, level, seq;
	
	Date reg_date;
	
	boolean today = false;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	public String getReg_dateStr() {
		return sdf.format(reg_date);
	}
	
	public String getContentBr() {
		
		return content.replaceAll("\n", "<br>");
	}
	
}
