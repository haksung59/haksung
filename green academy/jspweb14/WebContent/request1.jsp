<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>
	<h3>라디오버튼으로 값을 전송</h3>
	<form method="GET" action="request1pro.jsp">
		<p><input type="radio" value="현대자동차" name="car" checked="checked">현대자동차</p>
		<p><input type="radio" value="르노자동차" name="car">르노자동차</p>
		<p><input type="radio" value="GM자동차" name="car">GM자동차</p>
		<p>좋아하는 자동차를 하나 선택하시오: <input type="submit" value="선택">
	</form>
</body>
<script></script>
</html>