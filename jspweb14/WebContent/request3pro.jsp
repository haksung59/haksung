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
	<h3>폼3 데이터 받은 결과</h3>
	<%
		String name = request.getParameter("username");
		out.println(name+"는(은) ");
		String[] sports = request.getParameterValues("sports");
		for(int i=0; i<sports.length; i++){
			out.println(sports[i]+" ");
		}
		out.println("입니다");
	%>

</body>
<script></script>
</html>