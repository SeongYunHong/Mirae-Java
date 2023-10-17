package com.mirae;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/fortune") //annotation(클래스 설명) // tomcat서버는 servelt container이다. 
public class fortune extends HttpServlet { //HttpServlet : 최상단 object
	private static final long serialVersionUID = 1L;
       
    
    public fortune() {
        super();

    }
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//doGet(request,response);
    	 response.setCharacterEncoding("utf-8");
         response.setContentType("text/html;charset=utf-8");
         String[] list = { "즐거운 일주일의 시작이니 맘잘먹으면 좋은일 있을거에요", "행복하게 생각해서 행복한 날 ", "행복은 습관이다. 습관처럼 행복해지기" };
         int index = new Random().nextInt(3);
         String fortune = list[index];
         PrintWriter out = response.getWriter();
         // redirect 시켜서  jsp로 데이터를 전달
         out.println("<!doctype html>" + "<html>" + "<head>");
         out.println("<mata charset = 'utf-8' />");
         out.println("<title>오늘의 선택 페이지</title>");
         out.println("</head>");
         out.println("<body>");
         out.println("<p>" + fortune + "</p>");
         out.println("</body>");
         out.println("</html>");
	}

    //form에서 호출할 때 get(전송하는 데이터가 노출되는 타입)/ post(전송하는 데이터를 숨겨서 전송)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		//response.getWriter().append("Served at: ").append(request.getContextPath()); //한글 깨져서 주석처리했음
		response.setCharacterEncoding("UTF-8"); //setCharacterEncoding("UTF-8") : 입력되는 것들을 UTF-8로
		response.setContentType("text/html;charset=utf-8");
		String []list= {"즐거운 일주일의 시작이니 맘 잘먹으면 좋은 일이 있을거예요",
				"행복하게 생각해서 행복한 날",
				"행복은 습관이다. 습관처럼 행복해지기"};
		
		int index = new Random().nextInt();
		String fortune = list[index]; // -> Restful programming으로 발전,json(자바에서 사용하는 표준 데이터 포멧)으로 전달 
		//네트워크에서 데이터를 송수신할 때는 json을 사용
		//DBMS, NoSQL(Map(key(hash함수)))은 기본적으로 데이터를 json으로 송수신
		//react : 데이터만 넘겨받아서 작업?
		PrintWriter out = response.getWriter();
		// redirect 시켜서 jsp로 데이터 전달
		out.println("<!doctype html>"+"<html>"+"<head>");
		out.println("<meta charset='utf-8' />");
		out.println("<title>오늘의 선택 페이지</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+fortune+"</p>");
		out.println("</body>");
		out.println("</html>");
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
		response.setCharacterEncoding("UTF-8"); //setCharacterEncoding("UTF-8") : 입력되는 것들을 UTF-8로
		response.setContentType("text/html;charset=utf-8");
		String []list= {"즐거운 일주일의 시작이니 맘 잘먹으면 좋은 일이 있을거예요",
				"행복하게 생각해서 행복한 날",
				"행복은 습관이다. 습관처럼 행복해지기"};
		
		int index = new Random().nextInt();
		String fortune = list[index];
		PrintWriter out = response.getWriter();
		// redirect 시켜서 jsp로 데이터 전달
		out.println("<!doctype html>"+"<html>"+"<head>");
		out.println("<meta charset='utf-8' />");
		out.println("<title>오늘의 선택 페이지</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+fortune+"</p>");
		out.println("</body>");
		out.println("</html>");
	}
}