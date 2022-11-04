<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록 페이지</title>
</head>
<body>
<h1>게시판 목록 페이지</h1>
<table border="">
	<tr>
		<td>번호</td>
		<td>아이디</td>
		<td>비밀번호</td>
		<td>이름</td>
		<td>이메일</td>
		<td>우편번호</td>
		<td>주소</td>
		<td>가입일</td>
	</tr>
<c:forEach items="${mainData }" var="vo" varStatus="no">
	<tr>
		<td>${no.index+1 }</td>
		<td>${vo.id }</td>
		<td>%{vo.pwd }</td>
		<td>${vo.name }</td>
		<td>${vo.email }
		<td>${vo.zip_num }</td>
		<td>${vo.address } ${vo.address2 }</td>
		<td>${vo.indate }</td>
	</tr>
</c:forEach>

	<tr>
		<td colspan="9" align="right">
			<a href="writeForm">글쓰기</a>
		</td>
	</tr>
</table>
</body>
</html>