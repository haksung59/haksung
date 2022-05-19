<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>

	<%
		String id = request.getParameter("id");
		out.println("ID: "+id+"<br>");
		String pw = request.getParameter("pw");
		out.println("PW: "+pw);
	%>
	
</body>
<script></script>
</html>