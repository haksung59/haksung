<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form/fileForm</title>
</head>
<body>
<h1>form/fileForm</h1>

<h2>param</h2>
<form action="file1" method="post" enctype="multipart/form-data">
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
			<td>파일1</td>
			<td><input type="file" name="upfile1" /></td>
		</tr>
		<tr>
			<td>파일2</td>
			<td><input type="file" name="upfile2" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="등록" />
			</td>
		</tr>
	</table>
</form>

<h2>MultipartRequest</h2>
<form action="file2" method="post" enctype="multipart/form-data">
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
			<td>파일1</td>
			<td><input type="file" name="upfile1" /></td>
		</tr>
		<tr>
			<td>파일2</td>
			<td><input type="file" name="upfile2" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="등록" />
			</td>
		</tr>
	</table>
</form>

<h2>Class</h2>
<form action="file3" method="post" enctype="multipart/form-data">
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
			<td>파일1</td>
			<td><input type="file" name="upfile1" /></td>
		</tr>
		<tr>
			<td>파일2</td>
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