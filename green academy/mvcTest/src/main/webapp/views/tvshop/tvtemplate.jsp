<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tvshop</title>
</head>
<body>


<table border="">
	<tr>
		<td colspan="3"><a href="info/hello">회사소개</a>
		<a href="product/productlist">tv</a>
		<a href="notice/notice">공지사항</a></td>
	</tr>
	<c:forEach items="${contentData }" var="cd">
		<tr>
			<td colspan="3" align="center">${cd }</td>
		</tr>
	</c:forEach>	
</table>

</body>
</html>