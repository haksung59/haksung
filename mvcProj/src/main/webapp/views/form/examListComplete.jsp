<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examComplete</title>
</head>
<body>

	<table border="">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
			<td>총점</td>
			<td>평균</td>
			<td>등급</td>
		</tr>
<c:forEach items="${examList.arr }" var="exam" varStatus="no">		
		<tr>
			<td>${no.index }</td>
			<td>${exam.pname }</td>
			<td>${exam.kor }</td>
			<td>${exam.eng }</td>
			<td>${exam.mat }</td>
			<td>${exam.tot }</td>
			<td>${exam.avg }</td>
			<td>${exam.grade }</td>
		</tr>
</c:forEach>		
	</table>

</body>
</html>