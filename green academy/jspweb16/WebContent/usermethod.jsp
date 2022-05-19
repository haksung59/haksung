<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="com.hk.jsp.util.SimpleBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>
	<h3>jsp에서 메소드를 호출하기</h3>
	<%
		String name = "홍길동";
		
		//jsp에서 동작하는 방법
		//String hello = "안녕하세요?";
		//out.println(hello + name);
		
		//메소드를 호출하는 방법 - 반복되는 코드는 함수(메소드화) 호출가능
		SimpleBean sb = new SimpleBean();
		out.println(sb.printHello(name));
	%>

</body>
<script></script>
</html>