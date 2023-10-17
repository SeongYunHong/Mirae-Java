<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//servlet과 jsp의 차이
	String fortuneToday="대운이 들 운세 : 마음 먹은대로 될 수 있도록 마음을 잘 먹자";

%>
<p>오늘의 운세 : <strong><%=fortuneToday %></strong></p>
</body>
</html>