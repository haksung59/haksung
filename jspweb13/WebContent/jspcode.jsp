<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%!
	int sum=0;
	public int add(int x, int y){
		int result = 0;
		result = x+y;
		sum = result;
		return result;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>
	<%
		out.println("�հ��:"+add(10,20));
	%>
	<h2>HTML �ȿ� �ٷ� ��� ���������հ�:<%=sum %></h2>

</body>
<script></script>
</html>