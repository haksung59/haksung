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

	<h2>회원가입</h2>
	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" value="" name="id">
				<input type="button" value="중복확인" name="idcheck">
			</td>
		</tr>
		
		<tr>
			<td>비밀번호</td>
			<td><input type="password" value="" name="pw"></td>
		</tr>
		
		<tr>
			<td>비밀번호 확인</td>
			<td><input type="password" value="" name="pw"></td>
		</tr>
		
		<tr>
			<td>이름</td>
			<td><input type="text" value="" name="name"></td>
		</tr>
		
		<tr>
			<td>성별</td>
			<td><input type="radio" value="남" name="성별">남
				<input type="radio" value="여" name="성별">여
			</td>
		</tr>
		<tr>
			<td>생일</td>
			<td>
				<input type="text" value="" name="year" size="6" placeholder="년(4자)">
				<select name="month">
					<option selected="selected">월</option>
					<option>1월</option>
					<option>2월</option>
					<option>3월</option>
					<option>4월</option>
					<option>5월</option>
					<option>6월</option>
					<option>7월</option>
					<option>8월</option>
					<option>9월</option>
					<option>10월</option>
					<option>11월</option>
					<option>12월</option>
				</select>
				<input type="text" value="" name="day" size="5" placeholder="일">
			</td>
		</tr>
		
		<tr>
			<td>이메일</td>
			<td><input type="text" value="" name="email1" size="10">@
			<select name="email2">
				<option>naver.com</option>
				<option>daum.net</option>
				<option>gmail.com</option>
			</select>
			</td>
		</tr>
		
		<tr>
			<td>휴대전화</td>
			<td><input type="text" value="" name="phone"></td>
		</tr>
		
		<tr>
			<td>주소</td>
			<td>
				<input type="text" value="" name="address" size="40">
			</td>
		</tr>
	
	</table>
</body>
<script></script>
</html>