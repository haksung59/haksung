<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="com.hk.jsp.vo.UserVo" %>
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
		String message = "자바빈과 데이터베이스 연동 인덱스페이지";
		out.println(message);
		
		//기본적인 변수
		int score = 80; //정수타입
		char grade = 'A';	//문자타입
		//배열타입
		int[] scores = {80,90,70,60};
		//참조타입 - 사용자정의 타입(class사용)
		//id, passwd 등등 - getter setter
		
		UserVo kim = new UserVo();
		kim.setId(10000);
		kim.setPasswd("abcd");
		kim.setName("김건우");
		
		out.println("<br>");
		out.println("점수:"+score+"<br>");
		out.println("kim의정보:"+kim.getName()+"<br>");
		out.println("배열점수:"+scores[0]);
	%>

</body>
<script></script>
</html>