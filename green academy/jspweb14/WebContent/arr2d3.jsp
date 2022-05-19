<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style>
	table, td, th{
		border: 2px double black;
		border-collapse: collapse;
		padding: 5px;
	}
	th {
		background-color: violet;
	}
</style>
</head>
<body>

	<h2>구구단</h2>
	<%
		int[][] mat = new int[10][8];
		out.println("<table>");
		for(int r=0; r<mat.length; r++){
			out.println("<tr>");
			if(r==0){
				for(int c=0; c<mat[0].length; c++){
					out.println("<th>"+(c+2)+"단 </th>");
				}
			}else{
				for(int c=0; c<mat[1].length; c++){
					mat[r][c] = (c+2) * r;
					out.println("<td>"+(c+2)+"X"+r+"="+mat[r][c]+"</td>");
				}
			}
			out.println("<br>");
		}
		out.println("</table>");
	%>

</body>
<script></script>
</html>