<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글리스트쓰기</title>
</head>
<body>
글리스트쓰기

<form action="writeListReg">
	<table>
		<tr>
			<td>제목</td><td>작성자</td><td>암호</td><td>내용</td>
		</tr>
		
<c:forEach begin="0" end="4" var="i">
		
		<tr>
			<td><input type="text" name="arr[${i }].title" value="제목제목${i }"/></td>
			<td><input type="text" name="arr[${i }].pname" value="그린" /></td>
			<td><input type="text" name="arr[${i }].pw" value="1111"/></td>
			<td><textarea name="arr[${i }].content"cols="30" rows="1">내용내용${i*100 }</textarea></td>
		</tr>
</c:forEach>
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