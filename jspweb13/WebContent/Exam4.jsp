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
	<!--��ư Ŭ���ϸ� �ش��������� �̵�(�ڹٽ�ũ��Ʈ) -->
	
	<h3>�˻���������������</h3>

	<p><select id="site">
		<option id="naver">���̹�</option>
		<option id="google">����</option>
		<option id="daum">����</option>
	</select></p>
	
	<input type="button" value="�̵�" onclick="go();">

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