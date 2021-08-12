<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessionMypage</title>
</head>
<body>
	
	<div id = "wrapper">
		<h1>MyPage</h1>
		아이디 : ${id }<br>
		이름 : ${name }
		<input type = "button" value = "로그아웃" onclick = "logout()">
	</div>
	
</body>
<script>
	function logout(){
		alert("${name}님 로그아웃 되었습니다.");
		location.href = "sessionLogout";
	}
</script>
</html>