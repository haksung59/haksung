<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>
	<%
		//폼에서 전송한 값을
		//request.getParameter("")로 받아서 출력하시오
		//apple선택 - 사과라고 출력
		//banana선택 - 바나나라고 출력
		String fr = request.getParameter("fruit");
		out.println(fr);
	%>

</body>
<script></script>
</html>