<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글수정</title>
</head>
<body>
글수정

<form action="modifyReg">
	<input type="hidden" name="no" value="${mainData.no }"/>
	<table>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title" value="${mainData.title }"/></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td><input type="text" name="pname" value="${mainData.pname }"/></td>
		</tr>
		<tr>
			<td>암호</td>
			<td><input type="text" name="pw"/></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea name="content"cols="30" rows="10">${mainData.content }</textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="수정" />
				<a href="detail?no=${mainData.no }">뒤로</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>