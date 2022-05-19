<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>
	<h3>주소가 test.do를 입력하면 보여지는 화면</h3>
	<p>test 페이지입니다</p>
	<c:forEach var="weekarr" items="${weekday }">
		<p>${weekarr }</p>
	</c:forEach>

</body>
<script></script>
</html>