<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>
	<h3>셀렉트박스로 값을 전송(jsp서버쪽으로)</h3>
	<form method="GET" action="request2pro.jsp">
		<p>좋아하는 음료수:
		<select name="drink">
			<option value="오렌지쥬스">오렌지쥬스</option>
			<option value="팥빙수">밭빙수</option>
			<option value="애플쥬스">애플쥬스</option>
		</select></p>
		<p><input type="submit" value="전송"></p>
	</form>

</body>
<script></script>
</html>