<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>
	<h3>�ѱ��� ���� ��� ���</h3>
	
	<%
		// ������ ����� name="korea" ���� ���
		String kr = request.getParameter("korea");
		out.println("���� ���ڿ���: "+kr);
	%>

</body>
<script></script>
</html>