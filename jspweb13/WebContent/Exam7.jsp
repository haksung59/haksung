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

	<h3>�ݺ��� ����(�ڹٽ�ũ��Ʈ��)</h3>
	<form>
	<p>1���� ���� ������ �� : <input type="text" value="" id="num"></p>
	<p><input type = "button" value="Ȯ��" onclick="sum();">
	</form>

</body>
<script>

	function sum(){
		var number = parseInt(document.getElementById("num").value);
		var sum=0;
		for(i=1; i<=number; i++){
			sum += i;
		}
		document.write("����� : "+sum);
		
	}
	
</script>
</html>