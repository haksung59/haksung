<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록 페이지</title>
</head>
<body>
<h1>게시판 목록 페이지</h1>
<table border="">
	<tr>
		<td colspan="5" align="right">
			<form action="">
				제목 : <input type="text" name="sch"/>
				조회수 : <input type="text" name="cnt"/>
				
				오늘 : <input type="checkbox" name="today" value="true"/>
				<input type="submit" value="검색"/>
			</form>
		</td>
	</tr>

	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>작성일</td>
		<td>조회수</td>
	</tr>
	<c:forEach items="${mainData }" var="vo" varStatus="no">
		<tr>
			<td>${pageInfo.start+no.index+1 }</td>
			<td><a href="detail?no=${vo.no}">${vo.title }</a></td>
			<td>${vo.pname }</td>
			<td>${vo.reg_dateStr }</td>
			<td>${vo.cnt }</td>
		</tr>
	</c:forEach>

	
	<tr>
		<td colspan="5" align="right">
			<c:if test="${pageInfo.startPage>1 }">
			<a href="?nowPage=${pageInfo.startPage-1 }"> <- </a>
			</c:if>
			<c:forEach begin="${pageInfo.startPage }" end="${pageInfo.endPage}" var="i">
				<c:choose>
					<c:when test="${pageInfo.nowPage==i }">
						<b>[${i }]</b>
					</c:when>
					<c:otherwise>
						<a href="?nowPage=${i }">${i }</a>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			<c:if test="${pageInfo.endPage<pageInfo.totalPage }">
			<a href="?nowPage=${pageInfo.endPage+1 }"> -> </a>
			</c:if>
		</td>
	</tr>



	<tr>
		<td colspan="5" align="right">
			<a href="writeForm">글쓰기</a>
			<a href="writeListForm">리스트글쓰기</a>
		</td>
	</tr>
</table>
</body>
</html>