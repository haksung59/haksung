package com.hk.jsp.dao;

import java.sql.*;
import java.util.*;

import com.hk.jsp.vo.MemberVo;

public class MemberDao {
	
	static String driveName = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/jspweb";
	static String user = "jsp";
	static String password = "1234";
	
	private static Connection conn = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static MemberDao instance = new MemberDao();
	
	public static MemberDao getInstance() {
		return instance;
	}
	
	private void getConnect() throws Exception {
		
		Class.forName(driveName);
		System.out.println("드라이버로딩성공");
		if(conn == null) {	// =접속이 안되었으면.
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			System.out.println("데이터베이스접속성공");
		}
	}
	private void closeDB() {
		try {
			if(conn!=null) {conn.close(); conn=null;}
			if(stmt!=null) {stmt.close(); stmt=null;}
			if(rs!=null) {rs.close(); rs=null;}
			System.out.println("데이터베이스 접속종료 완료");
		}catch(SQLException e) {
			System.out.println("데이터베이스 쿼리오류: " + e.getMessage());
		}catch(Exception e2) {
			System.out.println("데이터베이스 접속오류" + e2.getMessage());
		}
	}
	public MemberVo getMemberById(String id) throws Exception {
		MemberVo mi = new MemberVo();
		getConnect();
		String sql = String.format("select * from member where name='김학성'", id);
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			mi.setId(rs.getString("id"));
			mi.setPwd(rs.getString("pwd"));
			mi.setName(rs.getString("name"));
			mi.setEmail(rs.getString("email"));
			mi.setZip_num(rs.getString("zip_num"));
			mi.setAddress(rs.getString("address"));
			mi.setAddress2(rs.getString("address2"));
			mi.setPhone(rs.getString("phone"));
			mi.setUseyn(rs.getString("useyn"));
			mi.setIndate(rs.getString("indate"));
		}
		
		
		return mi;
	}
	
	public List<MemberVo> getMemberList() throws Exception {
		List<MemberVo> members = new ArrayList<MemberVo>();
		getConnect();
		String sql = "select * from member";
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			MemberVo temp = new MemberVo();
			temp.setId(rs.getString("id"));
			temp.setPwd(rs.getString("pwd"));
			temp.setName(rs.getString("name"));
			temp.setEmail(rs.getString("email"));
			temp.setZip_num(rs.getString("zip_num"));
			temp.setAddress(rs.getString("address"));
			temp.setAddress2(rs.getString("address2"));
			temp.setPhone(rs.getString("phone"));
			temp.setUseyn(rs.getString("useyn"));
			temp.setIndate(rs.getString("indate"));
			members.add(temp);
		}
		closeDB();
		return members;
	}

}
