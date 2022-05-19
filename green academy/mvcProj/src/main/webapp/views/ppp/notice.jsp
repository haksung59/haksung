<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
div{
	background: #0f0;
	float: left;
	border: 1px solid #555;
	width: 300px;
	height : 300px;
	padding: 50px;
}


div > div{
	background: #f0f;
	float: left;
	border: 1px solid #555;
	width: 50px;
	height : 50px;
	padding: 20px;
}

</style>

<div>
<c:forEach items="${mainData}" var="mm">

		<div>${mm }</div>

</c:forEach>
	
</div>
<div><h1>공지사항</h1></div>