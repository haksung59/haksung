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
	<form action="Exam2pro.jsp">
	<p>당신의 성별은 : <input type="radio" value="남성" name="gender">남성
	<input type="radio" value="여성" name="gender">여성</p>
	<p>당신의 취미는 : <input type="checkbox" value="음악감상" name="hobby">음악감상
	<input type="checkbox" value="영화감상" name="hobby">영화감상
	<input type="checkbox" value="악기연주" name="hobby">악기연주</p>
	<p>당신의 직업은 : <select name="job">
		<option value="학생">학생</option>
		<option value="개발자">개발자</option>
		<option value="선생님">선생님</option>
	</select>
	<p><input type="submit" value="전송"><input type="button" value="취소"></p>
	</form>

</body>
<script></script>
</html>