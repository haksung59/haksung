<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style>
	fieldset {
		border:1px solid #888;
		border-right:1px solid #666;
		border-bottom:1px solid #666;
		width:250px;
	}
	legend {
		font-weight:bold;
		border:1px solid #888;
		border-right:1px solid #666;
		border-bottom:1px solid #666;
		padding: 0.5em;
		background-color:#666;
		color:#fff;
		text-shadow:0 -1px 0 #333;
		letter-spacing: 0.1em;
		text-transform:uppercase;
	}
	input#mid,#mpw {
		display:block;
		width:175px;
		float:left;
		margin-bottom:10px;
	}
	label {
		display:block;
		text-align:right;
		float:left;
		width:100px;
		padding-right: 20px;
	}
	.checkbox {
		width: 1em;
	}
	br {
		clear:left;
	}
	.buttonsubmit {
		width: 75px;
		margin-left:55px;
	}
</style>
</head>
<body>

	<form method="GET" action="exam4pro.jsp">
		<fieldset>
			<legend>회원 로그인</legend>
			<label for="userid">아이디</label><br>
			<input type="text" name="userid" id="userid" value="" /><br />
			
			<label for="userpw">비밀번호</label><br>
			<input type="password" name="userpw" id="userpw" value="" />
			<br>
			<p>로그인 저장?<input type="checkbox"></p>
			<input type="submit" name="submit" value="로그인" class="buttonsubmit"/>
			
		</fieldset>
	</form>
	

</body>
<script></script>
</html>