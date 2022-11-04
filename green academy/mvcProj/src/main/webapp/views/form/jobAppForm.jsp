<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form/jobAppForm</title>
</head>
<body>
<h1>form/jobAppForm</h1>

<form method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>id</td>
			<td><input type="text" name="pid" /></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="pname" /></td>
		</tr>
		<tr>
			<td>사진</td>
			<td><input type="file" name="upfile1" /></td>
		</tr>
		<tr>
			<td>이력서</td>
			<td><input type="file" name="upfile2" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="등록" />
			</td>
		</tr>
	</table>
</form>

</body>
</html>