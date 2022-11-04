<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
div{
	background: #ff0;
	float: left;
	border: 1px solid #555;
	width: 100px;
	height : 300px;
	padding: 50px;
}


div > div{
	background: #0ff;
	clear:both;
	border: 1px solid #555;
	width: 50px;
	height : 50px;
	padding: 20px;
}

</style>
<div><h1>TV</h1></div>
<div>
<c:forEach items="${mainData}" var="mm">

		<div>${mm }</div>

</c:forEach>
	
</div>