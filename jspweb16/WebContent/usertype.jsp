<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="com.hk.jsp.vo.UserScoreVo" %>
<%@ page import="com.hk.jsp.util.UserScoreBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>
	<h3>사용자정의 클래스 연습</h3>
	<%
		//성적에 대한 클래스 정의
		UserScoreVo john = new UserScoreVo();
		john.setName("John");
		john.setEng(80);
		john.setMat(100);
		john.setSci(90);
		
		int sum = john.getEng() + john.getMat() + john.getSci();
		double avg = sum / 3.0;
		out.println(john.getName()+"의 성적합계: " + sum+"<br>");
		out.println(john.getName()+"의 성정평균: "+ avg+"<br>");
		
		//UserScoreBean 호출해서 결과 출력하시오.
		UserScoreBean usb = new UserScoreBean();
		int sum2 = usb.CalculateSum(john);
		double avg2 = usb.CalculateAvg();
		out.println("john의 성적합계:"+sum2+"<br>");
		out.println("john의 성적평균:"+avg2+"<br>");
		
	%>

</body>
<script></script>
</html>