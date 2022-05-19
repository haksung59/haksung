<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
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
		int[][] mat = new int[5][5];
		// 1~25까지 저장
		int i=1;
		//짝수 줄은 거꾸로 출력
		
		out.println("<table>");
		for(int r=0; r<mat.length; r++){
			out.println("<tr>");
			if(r%2==0){
				for(int c=0; c<mat[0].length; c++){
					mat[r][c] = i++;
				}
			}else {
				for(int c=(mat[0].length-1); c>=0; c--){
					mat[r][c] = i++;
				}
			}
			
			for(int c=0; c<mat[0].length; c++){

				out.println("<td>"+mat[r][c]+"</td>");
			}
			out.println("<br>");
		}
		out.println("</table>");
	%>
</body>
<script></script>
</html>