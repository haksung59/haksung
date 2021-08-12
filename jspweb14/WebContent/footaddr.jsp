<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>

<%
	String addr = request.getParameter("address");
%>

<footer>
	<address><%= addr %></address>
</footer>