<%@page import="org.json.JSONArray"%>
<%@page import="jsontestProj.MenuVO"%>
<%@page import="jsontestProj.MenuDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String ss = request.getParameter("search");

	ArrayList<MenuVO> data = new MenuDAO().list(ss);
	
	JSONArray arr = new JSONArray(data);
	
	out.println(arr);
%>
