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
		//포인트 getParameter("");
		String car = request.getParameter("car");
		out.println("선택한 차량은 : "+ car);
	%>

</body>
<script></script>
</html>