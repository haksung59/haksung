<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="com.hk.jsp.dao.*" %>
<%@ page import="com.hk.jsp.vo.*" %>
<%@ page import="java.util.*" %>
<%
	String id= null;
	if(session.getAttribute("userid")==null) {	//세션이 없다면
		out.println("<script>alert('로그인되지 않았습니다.'); location.href='login_reg.jsp'</script>");
	}else {
		id=(String)session.getAttribute("userid");
	}
	MemberDao memdao = MemberDao.getInstance();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style>
	h3, form {
		width: 400px;
		margin: 0 auto;
	}
	input {
		width: 100%;
		padding: 10px;
		border: 1px solid #cccccc;
		margin-bottom: 5px;
	}
	input#sample6_postcode, input#zipsearch,
	input#regid, input#checkid, input#sample2_postcode {
		width: 40%;
		padding: 10px;
		border: 1px solid #cccccc;
		margin-bottom: 5px;
	}
	
	button {
		padding: 10px;
	}
	label {
		cursor: pointer;
	}
	#register-form {
		display: none;
	}
	#form-switch:checked~#register-form {
		display:block;
	}
	#form-switch:checked~#login-form {
		display:none;
	}
	#form-switch {
		display: none;	
	}
</style>
</head>
<body>
	<!-- 로그인한 회원의 회원정보를 출력하기
		이름, 이메일, 우편번호, 주소, 상세주소, 전화번호(아이디,비번제외)를 mypage에 출력하기. -->
		
	<h3>Mypage</h3>
	<br>
	<%
		id = "haksung59";
		MemberVo show = memdao.getMemberById(id);
	%>
	<form id="mem-form" action="" method="GET">
		
	
		<input type="text" name="name" placeholder="이름" value="<%=show.getName() %>">
		<input type="text" name="email" placeholder="이메일" value="<%=show.getEmail() %>">
		<input type="text" name="zip_num" placeholder="우편번호" value="<%=show.getZip_num() %>">
		<input type="text" name="address" placeholder="주소" value="<%=show.getAddress() %>">
		<input type="text" name="address2" placeholder="상세주소" value="<%=show.getAddress2() %>">
		<input type="text" name="phone" placeholder="전화번호" value="<%=show.getPhone() %>">
		
		<button type="button" onclick="logout();">로그아웃</button>
	</form>
	
	<script>
		function logout() {
			ok = confirm("로그아웃하시겠습니까?","");
			if(ok==true){
				location.href='logout.jsp';
			}
		}
	</script>

</body>
<script></script>
</html>