<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style>
	div.wrapper {
		margin: 0;
		padding: 0;
	}
	h1 {
		margin: 0;
		padding: 0;
	}
	header, nav, footer {
		width: 100%;
		margin: 0;
		padding: 0;
	}
	header {
		background-color: lightgray;
	}
	nav {
		background-color: red;
		height: 30px;
		line-height: 30px;
		padding: 0;
	}
	nav ul {
		list-style-type: none;
		padding: 0;
		margin: 0;
	}
	nav ul li {
		float: left;
		margin: 0 0 0 10px;
	}
	nav ul li a {
		color: blue;
	}
	section {
		background-color: lightgreen;
		padding: 1%;
		float: left;
		width: 68%;
		height: 400px;
	}
	aside {
		background-color: violet;
		padding: 1%;
		float: right;
		width: 28%;
		height: 400px;
	}
	footer {
		background-color: yellow;
		padding: 3px;
		clear: both;
		height: 20px;
	}
</style>
</head>
<body>

	<div class="wrapper">
		<jsp:include page="top.jsp"></jsp:include>
		
		<section>
			<h3>Column 1</h3>
			<p>
			<a href="">JSP STUDY</a><br><br>
			<a href="">Simple Templete</a><br></p>
			<p>
				Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Mauris vel magna. Mauris risus nunc, tristique varius, gravida in, lacinia vel, elit. Nam ornare, felis non faucibus molestie, nulla augue adipiscing mauris, a nonummy diam ligula ut risus. Praesent varius. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
				<br><br>
				Nulla a lacus. Nulla facilisi. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Fusce pulvinar lobortis purus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec semper ipsum et urna. Ut consequat neque vitae felis. Suspendisse dapibus, magna quis pulvinar laoreet, dolor neque lacinia arcu, et luctus mi erat vestibulum sem. Mauris faucibus iaculis lacus. Aliquam nec ante in quam sollicitudin congue. Quisque congue egestas elit. Quisque viverra. Donec feugiat elementum est. Etiam vel lorem.
			</p>
		</section>
	
		<jsp:include page="right.jsp"></jsp:include>
		
		<jsp:include page="footer.jsp"></jsp:include>
		
	</div>

</body>
<script></script>
</html>