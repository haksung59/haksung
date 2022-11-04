<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 메인 화면</title>
</head>
<body>

<h1>로그인 메인</h1>

<c:choose>
	<c:when test="${mem==null }">
		<form action="logReg">
			<label>ID:<input type="text" name="id" /></label>
			<label>PW:<input type="text" name="pw" /></label>
			<input type="submit" value="로그인" />
		</form>
	</c:when>
	<c:otherwise>
		${mem.id }<br>
		${mem.name }님 안녕하세요<a href="logOut">로그아웃</a>
	</c:otherwise>
</c:choose>


</body>
</html>