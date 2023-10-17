package com.student.mariadb;

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

import com.student.mariadb.StudentDAO;
import com.student.mariadb.StudentDTO;

@WebServlet("/StudentProcess")
public class StudentProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentProcess() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String str = request.getParameter("action");
		request.setCharacterEncoding("UTF-8");
		if(str.equals("insert")) {
			String name= request.getParameter("name");
			int kor = Integer.parseInt(request.getParameter("kor"));
			int mat = Integer.parseInt(request.getParameter("mat"));
			int eng = Integer.parseInt(request.getParameter("eng"));
			String schoolcode=request.getParameter("schoolcode");
			StudentDTO dto = new StudentDTO();
			
			dto.setName(name);
			dto.setKor(kor);
			dto.setMat(mat);
			dto.setEng(eng);
			dto.setSchoolcode(schoolcode);
			
			StudentDAO dao=new StudentDAO();
			boolean bool = dao.registerStudent(dto);
			PrintWriter out= response.getWriter();
			if(bool) response.sendRedirect("./Success.html");
			else out.println("입력에 실패하였습니다.");
		}
		else if(str.equals("select")) {
			StudentDAO dao = new StudentDAO();
			ArrayList<StudentDTO> vec = new ArrayList<StudentDTO>();
			vec = dao.getRecords();
			request.setAttribute("data1", vec);
			ServletContext context = this.getServletContext();
			RequestDispatcher dispatcher = context.getRequestDispatcher("/44_showstudent.jsp");
			dispatcher.forward(request, response);
		}
		else if (str.equals("update")) { // 업데이트
	         
	         request.setCharacterEncoding("UTF-8");
	         response.setContentType("text/html; charset=UTF-8");
	         int id = Integer.parseInt(request.getParameter("id"));
	         String name = request.getParameter("name");
	         int kor = Integer.parseInt(request.getParameter("kor"));
	         int mat = Integer.parseInt(request.getParameter("mat"));
	         int eng = Integer.parseInt(request.getParameter("eng"));

	         StudentDTO dto = new StudentDTO();
	         StudentDAO dao = new StudentDAO();
	         dto.setId(id);
	         dto.setName(name);
	         dto.setKor(kor);
	         dto.setMat(mat);
	         dto.setEng(eng);
	         boolean bool = dao.updateStudent(dto);
	         PrintWriter out = response.getWriter();
	         System.out.println("name4");
	         // 전달할 데이터가 없기 때문에 간단한 ReDirect 호출
	         if (bool) {
	            System.out.println("name5");
	            response.sendRedirect("./Success.html");
	         } else {
	            out.println("입력에 실패하였습니다");
	            out.println("<a href='44_StudentMenu.html'> 메뉴로 돌아가기</a>");
	         }
		}
		
		else if(str.equals("delete")) {
			String name = request.getParameter("name");
			
			StudentDTO dto = new StudentDTO();
			dto.setName(name);
			
			StudentDAO dao = new StudentDAO();
			Boolean bool = dao.deleteStudent(dto);
			
			PrintWriter out = response.getWriter();
			if(bool){ response.sendRedirect("./Success.html");}
			else {out.println("입력에 실패하였습니다.");
			out.println("<a href = '44_StudentMenu.html'>메뉴로 돌아가기</a>");}
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
