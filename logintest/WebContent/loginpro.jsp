<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="member.MemberDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginpro</title>
<style></style>
</head>
<body>

	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = "";
			
		MemberDTO mem = new MemberDTO();
		int result = mem.Idpwcheck(id,pw);
			
		if(result==0){
			out.println("<script>alert('비밀번호를 틀렸습니다. 다시 입력해 주세요.'); history.back();</script>");
		}else {
			name = mem.getName(id);
			session.setAttribute("userid", id);
			out.println("<script>alert('"+name+"님 로그인 되었습니다. 환영합니다.');location.href='mypage.jsp'</script>");
		}
	%>

</body>
<script></script>
</html>