<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="member.MemberDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mypage</title>
<style></style>
</head>
<body>

	<%
		String id = (String)session.getAttribute("userid");
		MemberDTO mem = new MemberDTO();
		String name = mem.getName(id);
	%>
	
	<h3>Mypage</h3>
	
	<p>이름 : <%=name%></p>
	
	<button onclick="logout();">로그아웃</button>

</body>
<script>
	function logout(){
		location.href="logout.jsp";
	}
</script>
</html>