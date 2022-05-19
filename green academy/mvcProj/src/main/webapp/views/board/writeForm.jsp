<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
글쓰기

<form action="writeReg">
	<table>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title" /></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td><input type="text" name="pname" /></td>
		</tr>
		<tr>
			<td>암호</td>
			<td><input type="text" name="pw" /></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea name="content"cols="30" rows="10"></textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="작성" />
				<a href="list">뒤로</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>