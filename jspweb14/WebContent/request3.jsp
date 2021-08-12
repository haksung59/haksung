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
	<h3>체크박스와 텍스트값을 전송(jsp서버)</h3>
	<form method="GET" action="request3pro.jsp">
		<p>당신의 이름: <input type="text" value="username"></p>
		<p>당신이 좋아하는 운동:
		<input type="checkbox" name="sports" value="야구">야구<br>
		<input type="checkbox" name="sports" value="수영">수영<br>
		<input type="checkbox" name="sports" value="골프">골프<br>
		<input type="checkbox" name="sports" value="테니스">테니스<br>
		</p>
		<p><input type="submit" value="전송"></p>
	</form>

</body>
<script></script>
</html>