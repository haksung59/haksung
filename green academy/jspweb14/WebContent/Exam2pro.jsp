<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
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
		String gender = request.getParameter("gender");
		out.println("당신의 성별은 : "+gender+"<br>");
		String hobby = request.getParameter("hobby");
		out.println("당신의 취미는 : "+hobby+"<br>");
		String job = request.getParameter("job");
		out.println("당신의 직업은 : "+ job);
	%>

</body>
<script></script>
</html>