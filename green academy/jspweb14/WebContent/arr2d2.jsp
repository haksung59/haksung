<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style>
	table, td{
		border: 1px solid black;
		border-collapse: collapse;
		padding: 5px;
	}
</style>
</head>
<body>
	<%
		int[][] mat = new int[5][5];
		// 1~25까지 저장
		int i=1;
		
		out.println("<table>");
		for(int r=0; r<mat.length; r++){
			out.println("<tr>");
			for(int c=0; c<mat[0].length; c++){
				
				mat[r][c] = i++;
				out.println("<td>"+mat[r][c]+"</td>");
				
			}
			out.println("<br>");
		}
		out.println("</table>");
	%>

</body>
<script></script>
</html>