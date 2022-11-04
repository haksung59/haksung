<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<table border="">
	<tr>
		<td colspan="4" align="center"><h1>OO쇼핑몰</h1></td>
		
	</tr>
	<%-- <tr align="center">
		<td width="200"><a href="<c:url value="/model/shop/info/hello?cate=info"/>">회사소개</a></td>
		<td width="200"><a href="<c:url value="/model/shop/productList?cate=product"/>">제품정보</a></td>
		<td width="200"><a href="<c:url value="/model/shop/galleryList?cate=gallery"/>">갤러리</a></td>
		<td width="200"><a href="<c:url value="/model/shop/center/notice?cate=center"/>">고객센터</a></td>
	</tr> --%>
	
	<tr align="center">
	<c:forEach items="${topData }" var="mm">
		<td width="200"><a href="<c:url value="${mm.url }"/>">${mm.value }</a></td>
		</c:forEach>
	</tr>
	<tr>
		<td colspan="4" align="right">로그인 정보</td>
	</tr>
</table>