<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table>
	<tr align="center">
		<c:forEach items="${topData}" var="mm">
			<td width="200"><a href="<c:url value="${mm.url }"/>">${mm.value }</a></td>
		</c:forEach>
	</tr>
</table>
    
