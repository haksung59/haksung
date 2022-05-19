<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="com.hk.jsp.dao.*" %>
<%@ page import="com.hk.jsp.vo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지갤러리</title>
<link rel="stylesheet" href="css/style_galshow.css"></link>
<style></style>
</head>
<body>
	<%
		String no = request.getParameter("no");
		GalleryDao galdao = GalleryDao.getInstance();
		GalleryVo row = galdao.getGalleryByNo(no);
	%>
	<div class="wrapper">
		<div class="title">
			<h3><%=row.getSubject() %></h3>
			<p><%=row.getRegdate() %></p>
		</div>
		
		<div class="galcontent">
			<img src="images/<%=row.getFilename1() %>" alt="워크샵">
			<div class="desc">
				<%=row.getContent() %>
			</div>
		</div>
		
		<div class="galcontrol">
			<div class="left">
				<button>이전글</button>
			</div>
			<div class="right">
				<button onclick="location.href='gallerylist.jsp'">목록</button>
				<button>다음글</button>
			</div>
		</div>
	</div>

</body>
<script></script>
</html>