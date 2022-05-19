<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inputStud/form</title>
</head>
<body>
<h1>inputStud/form</h1>


<h2>inputStud</h2>
<form method="post">
	<table border="">
		<tr>
			<td>id</td>
			<td><input type="text" name="pid" /></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><input type="text" name="age" /></td>
		</tr>
		<tr>
			<td>결혼</td>
			<td><input type="text" name="marriage" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit"  value="등록" />
			</td>
		</tr>
	</table>
</form>


<h2>inputStud2</h2>
<form method="post" action="inputStud2">
	<table border="">
		<tr>
			<td>id</td>
			<td><input type="text" name="pid" /></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><input type="text" name="age" /></td>
		</tr>
		<tr>
			<td>결혼</td>
			<td><input type="text" name="marriage" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit"  value="등록" />
			</td>
		</tr>
	</table>
</form>


</body>
</html>