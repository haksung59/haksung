<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>
	<h3>hellotest로 파라미터 연결테스트</h3>
	<button type="button" onclick="move();">링크테스트</button>

</body>
<script>
	function move(){
		var data = '김학성';
		var enc_data = encodeURI(data);
		location.href='hellotest.jsp?name='+enc_data;
	}
</script>
</html>