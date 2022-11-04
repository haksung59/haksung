<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inputOrderForm</title>
</head>
<body>
<h1>inputOrderForm</h1>

<form action="orderComplete">
	<table border="">
		<tr>
			<td>제품명</td>
			<td>단가</td>
			<td>수량</td>
		</tr>
<c:forEach begin="0" end="4" var="i" step="1">	
		<tr>
			<td><input type="text" name="product[${i }].name" /></td>
			<td><input type="text" name="product[${i }].price" /></td>
			<td><input type="text" name="product[${i }].cnt" /></td>
		</tr>
</c:forEach>

		
		<tr>
			<td rowspan="3">주소</td>
			<td>우편번호</td>
			<td><input type="text" name="addr.zipcode" /></td>
		</tr>
		
		<tr>
			<td>기본주소</td>
			<td><input type="text" name="addr.basic" /></td>
		</tr>
		<tr>
			<td>상세주소</td>
			<td><input type="text" name="addr.detail" /></td>
		</tr>
		<tr>
			<td colspan="3" align="right"><input type="submit" value="주문" /></td>
		</tr>
	</table>
</form>
</body>
</html>