<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>두개의 숫자 파라미터를 받아 두 숫자 사이의 모든 숫자의 합을 구하는jsp</h2>
	
	<form action="<%=request.getContextPath() %>/jsp/sum.jsp" method="get">
	<input type="text" name="number" value="1"/> <br>
	<input type="text" name="number2" value="10"/> <br>
	<input type="submit" value="실행"/>

	<form action="<%=request.getContextPath() %>/jsp/sum.jsp" method="get">
	<input type="text" name="number" value="1"/> <br>
	<input type="text" name="number2" value="10"/> <br>
	<input type="submit" value="실행"/>
</body>
</html>