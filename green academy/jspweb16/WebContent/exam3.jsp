<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="com.hk.jsp.dao.MemberDao" %>
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
		MemberDao memberdao = MemberDao.getInstance();
		MemberVo result = memberdao.getMemberById("haksung59");
	%>
	<p>아이디 : <%=result.getId() %></p>
	<p>비밀번호 : <%=result.getPwd() %></p>
	<p>이름 : <%=result.getName() %></p>
	<p>이메일 : <%=result.getEmail() %></p>
	<p>우편번호 : <%=result.getZip_num() %></p>
	<p>주소 : <%=result.getAddress() %></p>
	<p>상세주소 : <%=result.getAddress2() %></p>
	<p>폰번호 : <%=result.getPhone() %></p>
	<p>사용여부 : <%=result.getUseyn() %></p>
	<p>가입날짜 : <%=result.getIndate() %></p>

</body>
<script></script>
</html>