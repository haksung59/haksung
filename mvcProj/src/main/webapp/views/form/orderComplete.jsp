<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>orderComplete</title>
</head>
<body>
<h1>orderComplete</h1>

<table border="">
	<tr>
		<td>번호</td>
		<td>제품명</td>
		<td>단가</td>
		<td>수량</td>
		<td>합계</td>
	</tr>
<c:forEach items="${order.product }" var="pro" varStatus="no">	
	<tr>
		<td>${no.index }</td>
		<td>${pro.name }</td>
		<td>${pro.price }</td>
		<td>${pro.cnt }</td>
		<td>${pro.tot }</td>
	</tr>
</c:forEach>
</table>


</body>
</html>