<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style>
	table{
		width: 520px;
		border: 2px solid skyblue;
	}
	td {
		border: 1px solid skyblue;
	}
	td.name {
		width: 120px;
		background-color: skyblue;
	}
	p {
		width: 520px;
		text-align: center;
	}
</style>
</head>
<body>

	<h2>회원가입</h2>
	<table>
		<tr>
			<td class="name">아이디</td>
			<td><input type="text" value="" name="id" id="userid" size="20">
				<input type="button" value="중복확인" name="idcheck" onclick="idchk();">
			</td>
		</tr>
		
		<tr>
			<td class="name">비밀번호</td>
			<td><input type="password" value="" id="pw" name="pw" size="21"></td>
		</tr>
		
		<tr>
			<td class="name">비밀번호 확인</td>
			<td><input type="password" value="" id="pwchk" name="pwchk" size="21"></td>
		</tr>
		
		<tr>
			<td class="name">이름</td>
			<td><input type="text" value="" id="name" name="name"></td>
		</tr>
		
		<tr>
			<td class="name">성별</td>
			<td><input type="radio" value="남" name="성별">남
				<input type="radio" value="여" name="성별">여
			</td>
		</tr>
		<tr>
			<td class="name">생일</td>
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
			<td class="name">이메일</td>
			<td><input type="text" value="" name="email_1" size="20">@
			<input type="text" id="email_2" name="email_2" size="15" style="display:none">
			<select name="email_3" onchange="changeEmail(this.value);">
				<option value="naver.com" selected="selected">naver.com</option>
				<option value="daum.net">daum.net</option>
				<option value="gmail.com">gmail.com</option>
				<option value="1">직접입력</option>
			</select>
			</td>
		</tr>
		
		<tr>
			<td class="name">휴대전화</td>
			<td><input type="text" value="" name="phone"></td>
		</tr>
		
		<tr>
			<td class="name">주소</td>
			<td>
				<input type="text" value="" name="address" size="40">
			</td>
		</tr>
	
	</table>
	
	<p><input type="submit" value="가입" onclick="validate();">
	<input type="button" value="취소"></p>

</body>
<script>
	function idchk(){
		alert("중복체크");
	}
	function validate(){
		
		id= document.getElementById("userid").value;
		pw= document.getElementById("pw").value;
		pwchk= document.getElementById("pwchk").value;
		name = document.getElementById("name").value;
		if(id==""){
			alert("아이디를 입력하시오.");
			return;
		}else if(pw==""){
			alert("비밀번호를 입력하시오.");
			return;
		}else if(name==""){
			alert("이름을 입력하시오.");
		}else if(pw!=pwchk){
			alert("비밀번호가 다릅니다. 확인해 주십시오.");
		}else{
			alert("가입을 축하합니다.");
		}
	}
	function changeEmail(value){
		if(value==1){	//보이기
			document.getElementById("email_2").style.display="inline-block";
		}else{	//숨기기
			document.getElementById("email_2").style.display="none";
		}
	}
</script>
</html>