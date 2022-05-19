<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="com.hk.jsp.dao.*" %>
<%@ page import="com.hk.jsp.vo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>
	<%
		int pseq = Integer.parseInt(request.getParameter("p_no"));
		String p_name = request.getParameter("p_name");
		int kind = Integer.parseInt(request.getParameter("kind"));
		int price1 = Integer.parseInt(request.getParameter("price1"));
		int price2 = Integer.parseInt(request.getParameter("price2"));
		String explanation = request.getParameter("explanation");
		
		ProductDao productdao = ProductDao.getInstance();
		int no = productdao.findPseq();
		
		if(pseq<=no){
			out.println("<script>alert('중복된 상품번호가 있습니다." + (no+1) +"로 다시 입력해 주세요.'); history.back(); </script>");
		}
			
		ProductVo productvo = new ProductVo();
		productvo.setPseq(pseq);
		productvo.setName(p_name);
		productvo.setKind(kind);
		productvo.setPrice1(price1);
		productvo.setPrice2(price2);
		productvo.setContent(explanation);
			
		int result = productdao.regProduct(productvo);
		
		out.println("<script src='js/result.js'></script>");
		
	%>

</body>
<script></script>
</html>