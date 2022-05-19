<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>
	<h3>Hello_controller 만들어진 변수를 출력합니다.</h3>
	 <!--  표현언어는 간단한 변수의 출력 역할 -->
	 <!-- 자바스크립트처럼 숫자, 문자열, 불리언, null -->
	<p>${"안녕하세요" }</p>
	<p>${result }</p>
	<p>${num }</p>
	<p>${myinfo.id }</p>
	<p>${myinfo.pwd }</p>
	
	<h3>JSTL 예제</h3>
	<p><c:out value="Hello JSTL"/></p>
	<p>
		<c:set var="uservar1" value="문자열테스트1"/>
		${uservar1 }
	</p>
	
</body>
<script></script>
</html>