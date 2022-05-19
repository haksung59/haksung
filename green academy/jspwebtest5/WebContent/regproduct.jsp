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
	<h3>I-SHOP 상품 등록</h3>
	
	<form id=regproduct_form action="actproduct.jsp" method="get">
		<p>상품 번호:<br>
		<input type="text" id="p_no" name="p_no"><br>
		상품 이름:<br>
		<input type="text" id="p_name" name="p_name"><br>
		분류 번호:<br>
		<input type="text" id="kind" name="kind"><br>
		상품 판매가:<br>
		<input type="text" id="price1" name="price1"><br>
		상품 원가:<br>
		<input type="text" id="price2" name="price2"><br>
		</p>
		<br>
		<textarea id="explanation" name="explanation"></textarea>
		<br>
		<button onclick="check();">상품 등록</button>
	
	</form>

</body>
<script src="js/jquery-3.6.0.min.js"></script>
<script src="js/jscript.js"></script>
</html>