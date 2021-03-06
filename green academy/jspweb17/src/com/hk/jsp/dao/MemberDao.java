package com.hk.jsp.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.hk.jsp.vo.MemberVo;

public class MemberDao {
	
	//접속정보 (공통)
	static String driveName = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/jspweb";
	static String user = "jsp";
	static String password = "1234";
		
	//SQL 변수(공통)
	private static Connection conn = null;
	private static Statement stmt = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;
	//MemberDao 인스턴스 변수
	private static MemberDao instance = new MemberDao();

	private MemberDao() {
		
	}
	//생성자 (private) -> 싱글톤
	public static MemberDao getInstance() {
		if(instance==null) {
			instance = new MemberDao();
		}
		return instance;
	}
	// 초기화 블럭
	{
		try {
			Class.forName(driveName);
			System.out.println("드라이버로딩성공");
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
		}
	}
	//mysql 접속메소드 (공통)
	private void connectDB() throws Exception {
		
		if(conn == null) {	// =접속이 안되었으면.
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			System.out.println("데이터베이스접속성공");
		}
		
	}
	//mysql 접속종료메소드 (공통)
	private static void closeDB() {
		try {
			if(conn!=null) {conn.close(); conn=null;}
			if(stmt!=null) {stmt.close(); stmt=null;}
			if(pstmt!=null) {pstmt.close(); pstmt=null;}
			if(rs!=null) {rs.close(); rs=null;}
			System.out.println("데이터베이스 접속종료 완료");
		}catch(SQLException e) {
			System.out.println("데이터베이스 쿼리오류: " + e.getMessage());
		}catch(Exception e2) {
			System.out.println("데이터베이스 접속오류" + e2.getMessage());
		}
	}
	
	public void testDB() throws Exception {
		connectDB();
		//sql
		closeDB();
	}
	
	//	regmempro.jsp 에서 아이디 중복 체크
	public int checkMemberById(String id) throws Exception {
		int rst = 0; // 0이면 중복되지 않음(사용가능)
		connectDB();
		String sql = String.format("select count(id) as chk "
						+"from member where id='%s'", id);
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			rst = rs.getInt("chk");	// 숫자가 나오면 중복됨
		}
		closeDB();
		return rst;
	}
	
	// loginpro.jsp 에서 아이디 비밀번호 체크
	public int authMemberByIdPw(String id, String pw) throws Exception {
		int rst = 0;
		String dbid = "";
		String dbpw = "";
		connectDB();
		String sql = String.format("select id, pwd from member where id='%s'", id);
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			dbid = rs.getString("id");
			dbpw = rs.getString("pwd");
			System.out.println(dbid);
		}
		//비교
		if(dbid.equals(id)) {
			if(dbpw.equals(pw)) {
				rst = 1; //로그인 성공.
			}else {
				rst = -1;	//비밀번호 틀림.
			}
		}else {
			rst = 0; //아이디를 틀림.
		}
		closeDB();
		return rst;
	}
	
	public int regMember(MemberVo memvo) throws Exception {
		int rst = 0;
		connectDB();
		StringBuffer sb = new StringBuffer();
		sb.append("insert into member (id, pwd, name, email, zip_num, address, address2, phone, indate)" );
		sb.append("\n values (?, ?, ?, ?, ?, ?, ?, ?, now())");
		String sql = sb.toString();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, memvo.getId());
		pstmt.setString(2, memvo.getPwd());
		pstmt.setString(3, memvo.getName());
		pstmt.setString(4, memvo.getEmail());
		
		pstmt.setString(5, memvo.getZip_num());
		pstmt.setString(6, memvo.getAddress());
		pstmt.setString(7, memvo.getAddress2());
		pstmt.setString(8, memvo.getPhone());
		rst = pstmt.executeUpdate();
		closeDB();
		return rst;
	}
	
	public MemberVo getMemberById(String id) throws Exception {
		MemberVo rst = new MemberVo();
		connectDB();
		String sql = String.format("select name, email, "+ 
				"zip_num, address, address2, phone, pic "+ 
					" from member where id='%s'", id);
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			rst.setName(rs.getString("name"));
			rst.setEmail(rs.getString("email"));
			rst.setZip_num(rs.getString("zip_num"));
			rst.setAddress(rs.getString("address"));
			rst.setAddress2(rs.getString("address2"));
			rst.setPhone(rs.getString("phone"));
			rst.setPic(rs.getString("pic"));
		}
		closeDB();
		return rst;
	}
	
	//modifypro.jsp 회원정보 수정
	public int modifyMember(MemberVo memvo) throws Exception {
		int rst = 0;
		connectDB();
		StringBuffer sb = new StringBuffer("");
		sb.append("update member set name=?, email=?, zip_num=?, ");
		sb.append("\n address=?, address2=?, phone=?, pic=? where id=?");
		String sql = sb.toString();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, memvo.getName());
		pstmt.setString(2, memvo.getEmail());
		pstmt.setString(3, memvo.getZip_num());
		pstmt.setString(4, memvo.getAddress());
		pstmt.setString(5, memvo.getAddress2());
		pstmt.setString(6, memvo.getPhone());
		pstmt.setString(7, memvo.getPic());	// 사진정보가 없으면 원래이미지 유지
		pstmt.setString(8, memvo.getId());
		rst = pstmt.executeUpdate();
		
		closeDB();
		return rst;
	}
	
	//delmempro.jsp
	public int withdrawMemberById(String id) throws Exception {
		connectDB();
		
		String sql = String.format("update member set useyn='y' where id='%s'",id);
		int res = stmt.executeUpdate(sql);
		closeDB();
		return res;
	}
	
	
}
