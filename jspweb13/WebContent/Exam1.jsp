<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%!
	
	public int age(int a){
		int age = a;
		return age;
	}

	public String name(String n){
		String name = n;
		return name;
	}

	public String major(String m){
		String major = m;
		return major;
	}
	
	public char gender(char g){
		char gender = g;
		return gender;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>

	<% 
		out.println("���� : "+age(29)+"<br>");
		out.println("�̸� : "+name("���м�")+"<br>");
		out.println("���� : "+major("����"+"<br>"));
		out.println("���� : "+gender('M'));
	%>

</body>
<script></script>
</html>