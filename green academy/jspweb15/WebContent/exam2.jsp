<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb15</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>

	<h3>exam2 : emp테이블 데이터를 조회(id=admin)</h3>
	<%
		//접속정보를 정의 + 추가변수
		String driveName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jspweb";//디비정보
		String user = "jsp";
		String password = "1234";
		Connection conn = null;
		Statement stmt = null;	//쿼리에 변수가 일반적 쿼리
		//만약에 쿼리 변수가 있다면 preparedStatement pstmt
		ResultSet rs = null;
		String sql = "select id, name, passwd from emp where id='admin'";	//결과 3
		//Class EmpVo{ // 멤버변수 }
		
		//드라이브 로딩
		try {
			Class.forName(driveName);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				// EmpVo temp = new EmpVo();
				out.println(rs.getString("id") + " / ");
				out.println(rs.getString("name") + " / ");
				out.println(rs.getString("passwd")+ "<br>");
			}
			
			
		}catch(ClassNotFoundException e){
			out.println("<h3>드라이버 로딩 실패</h3>");
		}catch(SQLException e2){
			out.println("<h3>쿼리수행실패</h3>");
		}
		catch(Exception e3){
			out.println("<h3>mysql 접속 실패</h3>");
		}finally {
			// 디비 접속 및 수행 끝나면 리소스 반환
			if(conn!=null){ conn.close(); conn=null;}
			if(stmt!=null){ stmt.close(); stmt=null;}
			if(rs!=null){ rs.close(); rs=null;}
		}
		
		//접속정보나 메소드들은 반복으로 이루어짐==> class에서 메소드정의
	%>

</body>
<script></script>
</html>