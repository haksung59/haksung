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
	<h3>emp 직원등록화면</h3>
	<form method="GET" action="empregpro.jsp">
		<p><input type="type" name="empid" id="empid" value="" placeholder="아이디를 입력하시오."></p>
		<p><input type="type" name="empname" id="empname" value="" placeholder="이름을 입력하시오."></p>
		<p><input type="password" name="emppw" id="emppw" value="" placeholder="비밀번호를 입력하시오."></p>
		<p><input type="type" name="empjob" id="empjob" value="" placeholder="직책(직무)을 입력하시오."></p>
		<p><input type="type" name="empphn" id="empphn" value="" placeholder="전화번호를 입력하시오."></p>
		<p><button name="submit">등록하기</button> <button name="reset">취소하기</button>
	</form>

</body>
<script></script>
</html>