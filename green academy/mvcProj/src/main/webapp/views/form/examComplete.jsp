<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examComplete</title>
</head>
<body>

	<table border="">
		<tr>
			<td>이름</td>
			<td>${exam.pname }</td>
		</tr>
		<tr>
			<td>국어</td>
			<td>${exam.kor }</td>
		</tr>
		<tr>
			<td>영어</td>
			<td>${exam.eng }</td>
		</tr>
		<tr>
			<td>수학</td>
			<td>${exam.mat }</td>
		</tr>
		<tr>
			<td>총점</td>
			<td>${exam.tot }</td>
		</tr>
		<tr>
			<td>평균</td>
			<td>${exam.avg }</td>
		</tr>
		<tr>
			<td>등급</td>
			<td>${exam.grade }</td>
		</tr>
	</table>

</body>
</html>