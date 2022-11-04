<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fileComplete</title>
</head>
<body>
<h1>fileComplete</h1>
${zxcv }


<table border="">
	<tr>
		<td>ID</td>
		<td>${param.pid }</td>
	</tr>
	<tr>
		<td>나이</td>
		<td>${param.age }</td>
	</tr>
	<tr>
		<td>파일1</td>
		<td> <img src="<c:url value="/up/${upfile1 }"/>" alt="" />   </td>
	</tr>
	<tr>
		<td>파일2</td>
		<td>${upfile2 }</td>
	</tr>
</table>

</body>
</html>