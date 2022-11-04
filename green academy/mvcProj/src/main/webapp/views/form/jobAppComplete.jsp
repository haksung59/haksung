<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form/jobAppComplete</title>
</head>
<body>
<h1>form/jobAppComplete</h1>



<table border="">
	<tr>
		<td>ID</td>
		<td>${stud.pid }</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>${stud.pname }</td>
	</tr>
	<tr>
		<td>파일1</td>
		<td> <img src="<c:url value="/up/${stud.up1 }"/>" alt="" />   </td>
	</tr>
	<tr>
		<td>파일2</td>
		<td>${stud.upfile2.originalFilename }</td>
	</tr>
</table>

</body>
</html>