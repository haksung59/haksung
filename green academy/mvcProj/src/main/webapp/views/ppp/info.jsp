<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>회사소개</h1>
<c:forEach items="${mainData}" var="mm">

		<div>${mm }</div>

</c:forEach>
	
