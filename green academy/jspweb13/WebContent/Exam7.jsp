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

	<h3>반복문 예제(자바스크립트로)</h3>
	<form>
	<p>1부터 더할 임의의 값 : <input type="text" value="" id="num"></p>
	<p><input type = "button" value="확인" onclick="sum();">
	</form>

</body>
<script>

	function sum(){
		var number = parseInt(document.getElementById("num").value);
		var sum=0;
		for(i=1; i<=number; i++){
			sum += i;
		}
		document.write("결과는 : "+sum);
		
	}
	
</script>
</html>