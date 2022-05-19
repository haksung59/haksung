<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>세션 로그인</h1>

<form action="logReg">
	<table border="">
	<tr>
		<td>ID</td>
		<td><input type="text" name="id" /></td>
	</tr>
	<tr>
		<td>PW</td>
		<td><input type="password" name="pw" /></td>
	</tr>
	<tr>
		<td  colspan="2" align="center">
			<input type="submit" value="로그인">
		</td>
	</tr>
	</table>
</form>
</body>
</html>