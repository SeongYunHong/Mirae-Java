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
	int jumsu=0;
	int total=0;
	String level="";
%>
<%
	int count =Integer.parseInt(request.getParameter("mind_count"));
	for(int i=1;i<count;i++){
		String mind = request.getParameter("mind"+i);
		if(mind.equals("sel1")){jumsu=5;}
		else if(mind.equals("sel2")){jumsu=4;}
		else if(mind.equals("sel3")){jumsu=3;}
		else if(mind.equals("sel4")){jumsu=2;}
		else 							{jumsu=1;}
		
		total+=jumsu;
	}
	if(total < 13){level = "<h3>마음가짐이 좋습니다.</h3><br>더 정진해서 가정평화, 세계 평화를 이루시길 바랍니다.";}
	else if(total < 18){level = "<h3>평소 마음 편하게 생활을 하는 것 같습니다.</h3><br>경계선에 있으니 항상 마음을 갈고 닦으시길 바랍니다.";}
	else {level = "<h3>너무 어려움이 많이 있습니다.</h3><br>동네 한바뀌 뛰면서 생각을 정리하세요.";}
%>
<h1>당신의 현재 심리 검사 결과</h1>
<%=level %>
</body>
</html>
<!-- Enumeration e = request.getParameterNames(); 문항수 -->
<!--  while(e.hasMoreElements()) {-->
<!--  (String) e.nextElement(); -->