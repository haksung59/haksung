<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>
	<%@ include file="title.jsp" %>
	<h2>자바기반 웹프로그래밍을 톰캣서버에서 시작합니다.</h2>
	
	<%
		// 컴파일을 해서 처리 : 출력 + 계산 + 로직 + 디비
		out.println("<h3>자바기반JSP코드입니다</h3>");
	%>
</body>
<script>
	alert("자바스크립트 코드입니다");
</script>
</html>