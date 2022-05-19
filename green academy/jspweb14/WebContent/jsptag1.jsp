<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style>
	div,header, section, footer{
		padding: 10px;
		border: 1px solid green;
	}
</style>
</head>
<body>

	<div class="wrapper">
		
		<%-- 공통페이지를 만들 때 사용가능함. --%>
		<%-- @ include file="topmenu.jsp"--%>
		<jsp:include page="topmenu.jsp"></jsp:include>
		
		<section>
			<h3>메인페이지에 오신 것을 환영합니다.</h3>
			<p>메인내용입니다.</p>
		</section>
	
		<%--@ include file="footaddr.jsp" --%>
		
		<jsp:include page="footaddr.jsp">
			<jsp:param name="address" value="www.shopmall.com"/>
		</jsp:include>
	</div>

</body>
<script></script>
</html>