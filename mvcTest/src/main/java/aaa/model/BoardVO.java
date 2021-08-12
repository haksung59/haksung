package aaa.model;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	
	String id, pwd, name, email, zip_num, address, address2, phone, useyn, pic;
	Date indate;

}
