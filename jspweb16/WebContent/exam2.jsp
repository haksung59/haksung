<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.hk.jsp.vo.MemberVo" %>
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
		String driveName = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/jspweb";//디비정보
			String user = "jsp";
			String password = "1234";
		
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			String sql = "select * from member where id='haksung59'";
			MemberVo member = new MemberVo();
			
			try {
		Class.forName(driveName);
		conn = DriverManager.getConnection(url, user, password);
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		while(rs.next()){
			member.setId(rs.getString("id"));
			member.setPwd(rs.getString("pwd"));
			member.setName(rs.getString("name"));
			member.setEmail(rs.getString("email"));
			member.setZip_num(rs.getString("zip_num"));
			member.setAddress(rs.getString("address"));
			member.setAddress2(rs.getString("address2"));
			member.setPhone(rs.getString("phone"));
			member.setUseyn(rs.getString("useyn"));
			member.setIndate(rs.getString("indate"));
		}
		
			}catch(ClassNotFoundException e){
		
			}catch(SQLException e2){
		out.println("mysql 쿼리에러<br>");
			}
			catch(Exception e3){
		out.println("mysql디비 접속 실패<br>");
			}
	%>
	
	<p>검색된 아이디: <%=member.getId() %></p>
	<p>검색된 비밀번호: <%=member.getPwd() %> </p>
	<p>검색된 이름: <%=member.getName() %> </p>
	<p>검색된 이메일: <%=member.getEmail() %> </p>
	<p>검색된 우편번호: <%=member.getZip_num() %> </p>
	<p>검색된 주소: <%=member.getAddress() %> </p>
	<p>검색된 상세주소: <%=member.getAddress2() %> </p>
	<p>검색된 핸드폰번호: <%=member.getPhone() %> </p>
	<p>검색된 사용여부: <%=member.getUseyn() %> </p>
	<p>검색된 가입날짜: <%=member.getIndate() %> </p>
	

</body>
<script></script>
</html>