<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="42_delete_receive.jsp">
	<table width="40%" border="1">
		<caption><h3>회 원 삭 제 !</h3></caption>			
		<tr>
			<th width="30%">이름</th>
			<td width="70%" align="center">
			<input type="text" name="name" size="27%"/>
			</td>
		</tr>
	</table>
	<br/>
	<table>
		<tr>
			<td align="right">
			<input type="hidden" id="action" name="action" value="delete">
			<input type="submit" value="삭제 시작"/>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>