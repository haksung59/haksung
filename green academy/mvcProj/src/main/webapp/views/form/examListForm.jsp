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
<form method="post">
	<table border="">
		<tr>
			<td>번호</td><td>이름</td><td>국어</td><td>영어</td><td>수학</td>	
		</tr>
<c:forEach var="i" begin="0" end="5" step="1">		
		<tr>
			<td>${i }</td>
			<td><input type="text" name="arr[${i }].pname" /></td>
			<td><input type="text" name="arr[${i }].kor" /></td>		
			<td><input type="text" name="arr[${i }].eng" /></td>
			<td><input type="text" name="arr[${i }].mat" /></td>
		</tr>
</c:forEach>	
		<tr>
			<td colspan="5" align="center">
			 <input type="submit" value="작성" />
			 </td>
		</tr>
	</table>
</form>
</body>
</html>