<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style>
	body{
       width: 960px;
       padding: 0;
       margin: 0 auto;
       border: 1px solid black;
       font-family:Georgia, serif;
   }
   header h1{
      color:white;
      font-size:3em;
      padding-left:2%;
   }
   header{
       width: 100%;
       background-color: #554236;
       height: 120px;
       position: relative;
   }
   nav {
       width: 100%;
       height: 30px;
       position: absolute;
       left: 0;
       bottom: 0;
       background-color: #F77825;
   }
   aside{
       background-color: #60B99A;
       width: 25%;
       padding: 10px;
       float: left;
   }
   ul {
      list-style-type: none;
   }
   main p{
       margin-left: 27%;
       background-color: white;
       padding: 10px;
       line-height: 1.4em;
   }
   footer{
       background-color: #554236;
       height: 30px;
       width: 100%;
       clear: both;
   }
</style>
</head>
<body>
	
	<jsp:include page = "topmenu2.jsp">
		<jsp:param name="logo" value="LOGO이미지"/>
	</jsp:include>
	
	<jsp:include page="leftmenu2.jsp">
		<jsp:param name="logo" value="LOGO이미지"/>
	</jsp:include>
	
	<main>
	<p>
	 US Policy Editor Charles Sauer has a new commentary piece in Townhall on House 
	Resolution 3 which is designed to lower drug costs for Americans. Sauer thinks 
   	the legislation badly misses the mark. Here is an excerpt of his new article.
   	<br>
   	“Speaker Pelosi wants to reform healthcare – that much is clear – and for reforming 
   	healthcare, she has support from everyone in Congress. However, after that, 
	things get a bit murky because almost every single one of her proposals ignores the 
	business decisions that go into providing healthcare, innovating new drugs, 
	taking care of patients, or even the investment of going to medical school. 
	In other words – the car is beautiful, but it doesn’t have wheels or an engine.
	<br>
	We all want cheaper healthcare, we all want more access to care, we all want 
	better care, but to get those things, you can’t just snap your fingers and 
	make it happen.  There needs to be an incentive to build hospitals, 
	an incentive to develop new drugs, payment for treating patients,
	and a reason to spend so many years and so much money on education. 
	The supply of healthcare needs a reason to grow.   
	</p>
	</main>
	
	<jsp:include page="footaddr2.jsp"><jsp:param name="logo" value="LOGO이미지"/></jsp:include>

</body>
<script></script>
</html>