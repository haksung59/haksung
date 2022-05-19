package com.hk.jsp.dao;

import java.sql.*;
import com.hk.jsp.vo.*;

public class ProductDao {
	
	static String driveName = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String user = "scott";
	static String password = "tiger";

	private static Connection conn = null;
	private static Statement stmt = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;
	private static ProductDao instance = new ProductDao();
	
	private ProductDao() {}
	
	public static ProductDao getInstance() {
		return instance;
	}
	
	private void ConnectDB() throws Exception {
		Class.forName(driveName);
		System.out.println("오라클 드라이버 로딩 성공");
		if(conn==null) {	//접속 안된 상태
			conn  = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			System.out.println("오라클 접속 성공");
		}
	}
	
	private void closeDB() {
		
		try {
			if(conn!=null) {conn.close(); conn=null;}
			if(stmt!=null) {stmt.close(); stmt=null;}
			if(pstmt!=null) {pstmt.close(); pstmt=null;}
			if(rs!=null) {rs.close(); rs=null;}
			System.out.println("오라클 접속 종료 완료");
		}catch(Exception e) {
			System.out.println("오라클 접속 종료 오류");
		}
	}
	
	public int findPseq() throws Exception {
		int rst = 0;
		ConnectDB();
		String sql = "select max(pseq) as pseq from product";
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			rst = rs.getInt("pseq");
		}
		closeDB();
		return rst;
	}
	
	public int regProduct(ProductVo productvo) throws Exception {
		int rst = 0;
		ConnectDB();
		StringBuffer sb = new StringBuffer();
		sb.append("insert into product (pseq, name, kind, price1, price2, content, regdate)" );
		sb.append("\n values (?, ?, ?, ?, ?, ?, sysdate)");
		String sql = sb.toString();
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, productvo.getPseq());
		pstmt.setString(2, productvo.getName());
		pstmt.setInt(3, productvo.getKind());
		pstmt.setInt(4, productvo.getPrice1());
		pstmt.setInt(5, productvo.getPrice2());
		pstmt.setString(6, productvo.getContent());
		rst = pstmt.executeUpdate();
		closeDB();
		return rst;
	}
	
}
