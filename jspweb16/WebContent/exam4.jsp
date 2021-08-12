<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="com.hk.jsp.dao.MemberDao" %>
<%@ page import="com.hk.jsp.vo.MemberVo" %>
<%@ page import="java.util.*" %>
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
			List<MemberVo> memberlist = memberdao.getMemberList();
	%>
	
	<table width="1000px" border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>이메일</th>
			<th>우편번호</th>
			<th>주소</th>
			<th>상세주소</th>
			<th>폰번호</th>
			<th>사용여부</th>
			<th>가입날짜</th>
		</tr>
		
	<%
				for(int i=0; i<memberlist.size(); i++){
					MemberVo member = memberlist.get(i);
				out.println("<tr>");
					out.println("<td>" + member.getId() + "</td>");
					out.println("<td>" + member.getPwd() + "</td>");
					out.println("<td>" + member.getName() + "</td>");
					out.println("<td>" + member.getEmail() + "</td>");
					out.println("<td>" + member.getZip_num() + "</td>");
					out.println("<td>" + member.getAddress() + "</td>");
					out.println("<td>" + member.getAddress2() + "</td>");
					out.println("<td>" + member.getPhone() + "</td>");
					out.println("<td>" + member.getUseyn() + "</td>");
					out.println("<td>" + member.getIndate() + "</td>");
				out.println("</tr>");
					}
			%>	
	
	</table>

</body>
<script></script>
</html>