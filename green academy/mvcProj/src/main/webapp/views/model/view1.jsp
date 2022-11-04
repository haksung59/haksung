<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>model/model1</title>
</head>
<body>
<h1>model/model1</h1>
aaa:${aaa }<br>
bbb:${bbb }<br>
ccc:${ccc }<br>
ddd:${ddd }<br>
eee:${eee }<br>
<c:forEach items="${eee }" var="st" varStatus="no">
${no.index}->${st}<br>
</c:forEach>
</body>
</html>