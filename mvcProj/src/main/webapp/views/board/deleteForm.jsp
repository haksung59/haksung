<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 삭제</title>
</head>
<body>

<form action="deleteReg">
	<input type="hidden" name="no" value="${boardVO.no }"/>
	<table border="">
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="pw"></td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="삭제하기"/>
				<a href="list">뒤로</a>
			</td>
		</tr>
	</table>
	
</form>

</body>
</html>