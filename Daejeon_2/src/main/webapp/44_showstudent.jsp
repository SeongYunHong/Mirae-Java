<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*,java.lang.*,com.student.mariadb.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList<StudentDTO> vec = new ArrayList<StudentDTO>();
	vec = (ArrayList<StudentDTO>) request.getAttribute("data1");
%>
	<a href = "http://localhost:8080/Daejeon_2/44_StudentMenu.html">메뉴로 돌아가기</a>
	<table border=1>
		<tr>
			<th>번호</th><th>이름</th><th>국어</th><th>수학</th><th>영어</th><th>총점</th><th>평균</th><th>등급</th>
		</tr>
<%
		Iterator itrator = vec.iterator();	
		while(itrator.hasNext()){
			StudentDTO dto = (StudentDTO) itrator.next();
%>
		<tr>			
			<td><%=dto.getId() %></td>
			<td><%=dto.getName() %></td>
			<td><%=dto.getKor() %></td>
			<td><%=dto.getMat() %></td>
			<td><%=dto.getEng() %></td>
			<td><%=dto.getTotal() %></td>
			<td><%=dto.getAverage() %></td>
			<td><%=dto.getGrade() %></td>
		</tr>
<%
		}
%>
	</table>
</body>
</html>