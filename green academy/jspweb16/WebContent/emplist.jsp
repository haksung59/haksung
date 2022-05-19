<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="com.hk.jsp.dao.EmpDao" %>
<%@ page import="com.hk.jsp.vo.EmpVo" %>
<%@ page import="java.util.*" %>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>
	<h3>emp 직원총인원수 출력</h3>
	<%
		EmpDao empdao = EmpDao.getInstance();
		int total = empdao.getEmpTotal();
		
		List<EmpVo> emplist = empdao.getEmplist();
	%>
	
	<h3>총인원수:<%=total %></h3>
	
	<table width="500px" border="1">
		<tr>
			<th>이름</th>
			<th>직무</th>
			<th>폰번호</th>
		</tr>
	<%
		for(int i=0; i<emplist.size(); i++){
				EmpVo emp = emplist.get(i);
			out.println("<tr>");
				out.println("<td>" + emp.getName() + "</td>");
				out.println("<td>" + emp.getDesignation() + "</td>");
				out.println("<td>" + emp.getPhone() + "</td>");
			out.println("</tr>");
		}
	%>
	</table>

	<p><input type="button" value="직원등록" onclick="location.href='empreg.jsp'"></p>
</body>
<script></script>
</html>