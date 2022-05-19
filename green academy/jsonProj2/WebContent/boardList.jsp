<%@page import="org.json.JSONArray"%>
<%@page import="jsonProj.ZxcvDAO"%>
<%@page import="jsonProj.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String start = "10";

	if(request.getParameter("start")!=null) {
		start = request.getParameter("start");
	}
	
	int ss = Integer.parseInt(start);
	
	String end = "30";

	if(request.getParameter("end")!=null) {
		end = request.getParameter("end");
	}
	
	int ee = Integer.parseInt(end);

	ArrayList<BoardVO> data = new ZxcvDAO().list(ss,ee);

	//out.println(data);
	
	JSONArray arr = new JSONArray(data);
	
	out.println(arr);
	
%>