<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fileComplete3</title>
</head>
<body>
<h1>fileComplete3</h1>

<table border="">
	<tr>
		<td>ID</td>
		<td>${applicant.id }</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>${applicant.name }</td>
	</tr>
	<tr>
		<td>이력서</td>
		<td>${applicant.upfile1.originalFilename }</td>
	</tr>
	<tr>
		<td>사진</td>
		<td><img src="<c:url value="/up/${applicant.up2 }"/>" alt="이미지 파일을 첨부해주세요." width="200" height="100" /></td>
	</tr>
</table>

</body>
</html>