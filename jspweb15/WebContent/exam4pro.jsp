<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>

	<%
		String id = request.getParameter("mid");
		String pw = request.getParameter("mpw");
	
		String driveName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jspweb";//디비정보
		String user = "jsp";
		String password = "1234";
		String DBid = "";
		String DBpw = "";
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driveName);
			conn = DriverManager.getConnection(url, user, password);
			String sql = "select id, pwd from member where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				DBid = rs.getString("id");
				DBpw = rs.getString("pwd");
				
				
			}
		}catch(ClassNotFoundException e){
			out.println("<h3>드라이버 로딩 실패</h3>");
		}catch(SQLException e2){
			out.println("<h3>쿼리수행실패</h3>");
		}
		catch(Exception e3){
			out.println("<h3>mysql 접속 실패</h3>");
		}
		
		if(id!=null && id.equals(DBid)){
			if(pw!=null && pw.equals(DBpw)){
				response.sendRedirect("exam5.jsp");
			}else{
				out.println("비밀번호가 틀립니다.");
			}
		}else {
			out.println("아이디가 틀립니다.");
		}
		
	%>

</body>
<script></script>
</html>