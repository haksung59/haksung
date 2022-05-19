<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%
	request.setCharacterEncoding("utf-8");
	String logo = request.getParameter("logo");
%>
	<header>
		<h1><%= logo %></h1>
		<nav>상단메뉴</nav>
	</header>
