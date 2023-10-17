package com.emp.mariadb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmpProcess")
public class EmpProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EmpProcess() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String str = request.getParameter("action"); //CRUD를 구분하기 위해 전달받음
		request.setCharacterEncoding("UTF-8");
		if(str.equals("insert")) { //입력
			int id = Integer.parseInt(request.getParameter("id"),10);
			String name = request.getParameter("name");
			float salary = Float.parseFloat(request.getParameter("salary"));
			
			EmpDTO dto = new EmpDTO();
			dto.setId(id);
			dto.setName(name);
			dto.setSalary(salary);
			
			EmpDAO dao = new EmpDAO();
			Boolean bool = dao.registerEmp(dto);
			
			PrintWriter out = response.getWriter();
			//전달할 데이터가 없기 때문에 간단한 ReDirect호출
			if(bool){ response.sendRedirect("./Success.html");}
			//Success.html로 연결
			else {out.println("입력에 실패하였습니다.");
			out.println("<a href = '43_EmpMenu.html'>메뉴로 돌아가기</a>");}
		}
		else if(str.equals("select")) {
			EmpDAO dao = new EmpDAO();
			ArrayList<EmpDTO> vec = new ArrayList<EmpDTO>();
			vec = dao.getRecords(1,5);
			request.setAttribute("data1", vec); //속성으로 데이터를 설정해줌
			//RequestDispatcher : 객체를 얻어서 forwarding하는 절차
			//Context : 환경과 설정 정보
			ServletContext context = this.getServletContext(); //<- 이거 없으면 RequestDispatcher 사용 불가
			//응답 페이지로 데이터를 전달
			RequestDispatcher dispatcher = context.getRequestDispatcher("/43_showemp.jsp");
			//RequestDispatcher를 통해 자동으로 43_showemp.jsp로 넘어감
			dispatcher.forward(request, response);
		}
		else if(str.equals("update")) {
			int id = Integer.parseInt(request.getParameter("id"),10);
			String name = request.getParameter("name");
			float salary = Float.parseFloat(request.getParameter("salary"));
			
			EmpDTO dto = new EmpDTO();
			dto.setId(id);
			dto.setName(name);
			dto.setSalary(salary);
			
			EmpDAO dao = new EmpDAO();
			Boolean bool = dao.updateEmp(dto);
			
			PrintWriter out = response.getWriter();
			if(bool){ response.sendRedirect("./Success.html");}
			else {out.println("입력에 실패하였습니다.");
			out.println("<a href = '43_EmpMenu.html'>메뉴로 돌아가기</a>");}
		}
		
		else if(str.equals("delete")) {
			String name = request.getParameter("name");
			
			EmpDTO dto = new EmpDTO();
			dto.setName(name);
			
			EmpDAO dao = new EmpDAO();
			Boolean bool = dao.deleteEmp(dto);
			
			PrintWriter out = response.getWriter();
			if(bool){ response.sendRedirect("./Success.html");}
			else {out.println("입력에 실패하였습니다.");
			out.println("<a href = '43_EmpMenu.html'>메뉴로 돌아가기</a>");}
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}