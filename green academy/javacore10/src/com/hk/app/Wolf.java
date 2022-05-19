package com.hk.app;

import java.util.*;

import com.hk.app.dao.*;	//다른 패키지에 있는 클래스를 사용하려면 import로 연결해야 함.
public class Wolf {
	DBManager dbconn = new DBManager();
	
	
	//com.hk.app.dao.DBManager dbccc = new com.hk.app.dao.DBManager();		--> import문을 안 쓸 경우 이런식으로 사용 가능.
	
	
	public void inputTitle() {
		Scanner reader = new Scanner(System.in);
		Random num = new Random();
	}
}
