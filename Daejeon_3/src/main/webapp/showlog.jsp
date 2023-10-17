<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*,com.sungjuk.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
p

	ArrayList<LoginDTO> vec = new ArrayList<LoginDTO>();
	vec = (ArrayList<LoginDTO>)request.getAttribute("userLog");
%>
	<center>
		<h3>정보 출력</h3>
		<table border=1>
			<tr>
				<th>이름</th><th>아이디</th><th>비밀번호</th>
			</tr>
<%
p

	Iterator itr = vec.iterator();
	while(itr.hasNext()){
		LoginDTO dto = (LoginDTO)itr.next();
%>
			<tr>
				<td><%=dto.getName() %></td><td><%=dto.getUserid() %></td><td><%=dto.getPassword() %></td>
			</tr>
<%			
			}
%>
		</table>
	</center>
</body>
</html>