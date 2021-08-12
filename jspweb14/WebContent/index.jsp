<%@ page language="java" contentType="text/html; charset=UTF-8"%>
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
		out.println("jsp14웹프로그래밍 시작입니다.");
		//main.jsp으로 강제적으로 이동처리
		response.sendRedirect("main.jsp");
	%>

</body>
<script></script>
</html>