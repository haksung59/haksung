<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
íėŽėę°
 <table width="200">
 	<c:forEach items="${menuData }" var="mm" varStatus="no">
 	<tr>
 		<td><a href="">${no.index }-${mm }</a></td>
	</tr>
 	</c:forEach>
 </table>
 