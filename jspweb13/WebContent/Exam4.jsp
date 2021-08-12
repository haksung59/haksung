<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jspweb13</title>
<link rel="stylesheet" href="css/style.css"></link>
<style></style>
</head>
<body>
	<!--버튼 클릭하면 해당페이지로 이동(자바스크립트) -->
	
	<h3>검색엔진정보페이지</h3>

	<p><select id="site">
		<option id="naver">네이버</option>
		<option id="google">구글</option>
		<option id="daum">다음</option>
	</select></p>
	
	<input type="button" value="이동" onclick="go();">

</body>
<script>
	function go(){
		var st = document.getElementById("site");

		for(i=0; i<st.length; i++){
			if(st[0].selected){
				location.href="http://www.naver.com";
			}else if (st[1].selected){
				location.href="http://www.google.com";
			}else {
				location.href="http://www.daum.net";
			}
		}
		
	}
</script>
</html>