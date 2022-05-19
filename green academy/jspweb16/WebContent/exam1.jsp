<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="com.hk.jsp.util.UserSumBean" %>
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
		//sum(100) 출력
		UserSumBean usb = new UserSumBean();
		out.println(usb.sum(100));
		
	%>

</body>
<script></script>
</html>