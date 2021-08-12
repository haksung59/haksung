package com.hk.jsp.dao;
import java.sql.*;
import java.util.*;

import com.hk.jsp.vo.EmpVo;

public class EmpDao {
	
	//접속정보를 정의
	static String driveName = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/jspweb";
	static String user = "jsp";
	static String password = "1234";
	
	// 데이터베이스를 사용하는 동안에는 계속 생성할 필요가 없음.
	// 생성자와 접속정보들 외부에서 사용할 필요가 없음.
	// public 대신 private 형식으로 사용할 수 있다.
	private static Connection conn = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static EmpDao instance = new EmpDao();
	//생성자 -> 내부적으로 생성함.
	// 싱글톤 클래스 라고 부른다 = static 으로 선언됨.
	public EmpDao() {
		
	}
	
	public static EmpDao getInstance() {
		return instance;
	}
	// 결론 : 외부jsp에서 참조변수를 여러개 만들 필요가 없음.
	// instance 참조변수만 전달해주면 된다.
	private void getConnect() throws Exception {
		
		Class.forName(driveName);
		System.out.println("드라이버로딩성공");
		if(conn == null) {	// =접속이 안되었으면.
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			System.out.println("데이터베이스접속성공");
		}
		
		
		
		
	}
	//	접속을 종료하는 메소드
	private static void closeDB() {
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
	//접속 및 종료 테스트 메소드
	public void testConnect() throws Exception {
		getConnect();
		//작업코드
		closeDB();
	}
	//emp 테이블의 총인원 - emplist.jsp
	public int getEmpTotal() throws Exception {
		int rst=0;
		getConnect();
		String sql = "select count(*) as cnt from emp";
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			rst = rs.getInt("cnt");
		}
		//주의사항 : 디비사용후에는 반드시 종료를 한다.
		closeDB();
		
		return rst;
	}
	// emp 테이블의 특정정보 - empinfo2.jsp
	public EmpVo getEmpById(String id) throws Exception {
		EmpVo rst = new EmpVo();	//결과값 EmpVo
		getConnect();	//접속
		String sql = String.format("select * from emp where id='%s'",id);
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			rst.setId(rs.getString("id"));
			rst.setName(rs.getString("name"));
			rst.setPasswd(rs.getString("passwd"));
			rst.setDesignation(rs.getString("designation"));
			rst.setPhone(rs.getString("phone"));
		}
		//주의사항 : 디비사용후에는 반드시 종료를 한다.
		closeDB();
		return rst;
	}
	
	//전체 직원 목록 출력(이름, 직무, 폰번호) emplist.jsp
	public List<EmpVo> getEmplist() throws Exception {
		List<EmpVo> emps = new ArrayList<EmpVo>();
		getConnect();	//접속
		String sql = "select * from emp";
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			EmpVo temp = new EmpVo();
			temp.setId(rs.getString("id"));
			temp.setName(rs.getString("name"));
			temp.setPasswd(rs.getString("passwd"));
			temp.setDesignation(rs.getString("designation"));
			temp.setPhone(rs.getString("phone"));
			//콜렉션
			emps.add(temp);
		}
		closeDB();
		
		return emps;
	}
	
	// 직원등록 empregpro.jsp
	public int regEmp(String id, String name, String pw, String jobid, String phn) throws Exception {
		int result = 0;	//등록여부
		getConnect();
		String sql = String.format("insert into emp values ('%s', '%s', '%s', '%s', '%s')", id, name, pw, jobid, phn);
		result = stmt.executeUpdate(sql);	//성공시 1대입
		closeDB();
		
		return result;
		
	}

}
