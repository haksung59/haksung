<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>
	<h3>compare.do를 실행했을 때 화면</h3>
	<p>영어점수는 ${score }</p>
	<c:if test="${score >=70 }">
	<p>학점은 PASS 입니다</p>
	</c:if>
	<c:if test="${score <70 }">
	<p>학점은 FAIL 입니다</p>
	</c:if>
	
	<p>자바점수는 ${score2 }</p>
	<c:choose>
		<c:when test="${score2 >= 90 }">
		<p>학점은 A입니다.</p>
		</c:when>
		<c:when test="${score2 >= 80 }">
		<p>학점은 B입니다.</p>
		</c:when>
		<c:otherwise>
		<p>학점은 C입니다.</p>
		</c:otherwise>
	</c:choose>

</body>
<script></script>
</html>