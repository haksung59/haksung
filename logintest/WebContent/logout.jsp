<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
<style></style>
</head>
<body>

	<%
		session.invalidate();
		response.sendRedirect("login.jsp");
	%>

</body>
<script></script>
</html>