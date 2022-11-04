<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TV</title>
</head>
<body>
<table border="">
	<tr>
		<td>
			<jsp:include page="Desktop/GitRepo/haksung/green academy/mvcProj/src/main/webapp/views/ppp/header.jsp"/>
		</td>
	</tr>
	<tr>
		<td></td>
	</tr>
	<tr>
		<td>
			<jsp:include page="${service}.jsp"/>
		</td>
	</tr>
</table>
</body>
</html>