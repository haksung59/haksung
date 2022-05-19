<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쇼핑몰</title>
</head>
<body>


<table border="">
	<tr>
		<td colspan="2">
			<jsp:include page="header.jsp"/>
		</td>
	</tr>
	
	
	<tr>
		<td width="200">
			<jsp:include page="menu.jsp"/>
		</td>
		<td>
			<jsp:include page="${main }.jsp"/>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<jsp:include page="footer.jsp"/>
		</td>
	</tr>
</table>

</body>
</html>