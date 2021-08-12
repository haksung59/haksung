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
	width:400px;
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
	input {
		display:block;
		width:175px;
		float:left;
		margin-bottom:10px;
	}
	input#mid, #zipnum {
	    display:block;
	    width:90px;
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
	.buttoncheck {
		width: 50px;
		margin-left:10px;
	}
	.buttonsubmit {
		width: 75px;
		margin-left:95px;
	}
	.buttonsubmit {
		width: 75px;
		margin-left:55px;
	}
	
</style>
</head>
<body>

	<form method="GET" action="exam3pro.jsp">
		<fieldset>
			<legend>회원 가입</legend>
			<label for="mid">아이디</label>
			<input type="text" name="mid" id="mid" value="" />
			<input type="button" name="button" value="중복?" class="buttoncheck" /><br />
			
			<label for="mpw">비밀번호</label>
			<input type="password" name="mpw" id="mpw" value="" /><br />
			<label for="mname">회원이름</label>
			<input type="text" name="mname" id="mname" value="" /><br />
			<label for="email">이메일</label>
			<input type="text" name="email" id="email" value="" /><br />
			
			<label for="zipnum">우편번호</label>
			<input type="text" name="zipnum" id="zipnum" value="" />
			<input type="button" name="button" value="검색" class="buttoncheck" /><br />
			
			<label for="address">주소</label>
			<input type="text" name="address" id="address" value="" /><br />
			
			<label for="address2">상세주소</label>
			<input type="text" name="address2" id="address2" value="" /><br />
			
			<label for="phone">전화번호</label>
			<input type="text" name="phone" id="phone" value="" /><br />
			
			<input type="submit" name="submit" value="가입하기" class="buttonsubmit"/>
			<input type="reset" name="reset" value="다시작성" class="buttonsubmit" />
		</fieldset>
	</form>

</body>
<script></script>
</html>