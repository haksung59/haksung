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
		String name = request.getParameter("mname");
		String email = request.getParameter("email");
		String zipnum = request.getParameter("zipnum");
		String address = request.getParameter("address");
		String address2 = request.getParameter("address2");
		String phn = request.getParameter("phone");
		
		PreparedStatement pstmt = null;
		Connection conn = null;
		
		String driveName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jspweb";//디비정보
		String user = "jsp";
		String password = "1234";
		
		try {
			Class.forName(driveName);
			//out.println("<h3>드라이버 로딩 성공<h3>");
			conn = DriverManager.getConnection(url, user, password);
		
			String sql = "insert into member (id,pwd,name,email,zip_num,address,address2,phone) values (?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			pstmt.setString(5, zipnum);
			pstmt.setString(6, address);
			pstmt.setString(7, address2);
			pstmt.setString(8, phn);
			int result = pstmt.executeUpdate();
			
			if(result==1){
				response.sendRedirect("exam3.jsp");
			}else{
				out.println("등록 실패했습니다.");
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
			if(pstmt!=null){ pstmt.close(); pstmt=null;}
		}
		
		
	%>

</body>
<script></script>
</html>