package com.sungjuk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
   
   // 미리 지정한 아이디와 패스워드
   // DB하고 연결해서 처리하시오
   /*
      문제 sungjuk디비에 - login을 위해서 userID,password 테이블 생성
      로그인서블릿에서 디비를 연결하고 클라이언트에서 요청하는 ID에 대하여 패스워드를 가지고 옴
   */
   
    public LoginServlet() {
        super();
    }


   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //response.getWriter().append("Served at: ").append(request.getContextPath());
      request.setCharacterEncoding("UTF-8");
      response.setContentType("text/html;charset=utf-8");
      String str = request.getParameter("action");
      if(str.equals("insert")) {
         String userID = request.getParameter("userID");
         String password = request.getParameter("password");
         
         LoginDTO dto = new LoginDTO();
         dto.setUserID(userID);
         dto.setPassword(password);
         
         LoginDAO dao = new LoginDAO();
         int result = dao.join(dto);
         PrintWriter out = response.getWriter();
         if(result == 0) response.sendRedirect("./success1.html");
         else out.println("입력에 실패하였습니다.");      
      }
      else if( str.equals("select")) {
      String user = request.getParameter("user");
      String pwd = request.getParameter("pwd");
      
      LoginDAO dao = new LoginDAO();
      try {
            if (dao.validateUser(user, pwd)) {
                // 로그인 성공 처리
               HttpSession session = request.getSession(); // 세션 : 새로운 유저마다 생성
             session.setAttribute("user", "korea"); // 로그아웃하고 사이트에서 나갈 때 까지 유지 됨
             // session.setMaxInactiveInterval(60);
             session.setMaxInactiveInterval(60); // 세션이 30분만 유지됨
             Cookie userName = new Cookie("user", user); // 웹브라우저에 저장
             // userName.setMaxAge(30*60);
             userName.setMaxAge(60);
             response.addCookie(userName); // 보내기만 하면 웹브라우저에서 자동 저장
             response.sendRedirect("LoginSuccess.jsp");
            } else {
                // 로그인 실패 처리
               // chainning -> 메서드().메서드()
             RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
             PrintWriter out = response.getWriter(); // 출력객체를 얻은 다음
             // 두 개의 결과를 결합해서 출력
             out.println("<font color=red>id와 pw 잘못됐다 이녀석아</font>");
             rd.include(request, response); // <-> forward
            }
        } catch(Exception e) {
            e.printStackTrace();
            // DB 에러 처리
        }
   }
      else if (str.equals("update")) {
         LoginDAO dao = new LoginDAO();
         String userID = request.getParameter("userID");
         String password = request.getParameter("password");
         // String schoolcode = request.getParameter("schoolcode");
         LoginDTO dto = new LoginDTO();
         dto.setUserID(userID);
         dto.setPassword(password);
         
         int result = dao.update(dto);
         PrintWriter out = response.getWriter();
         if(result == 0) response.sendRedirect("./success1.html");
         else out.println("수정이 실패하였습니다.");
      }
      
      else if (str.equals("delete")) {
         String userID = request.getParameter("userID");
         LoginDTO dto = new LoginDTO();
         dto.setUserID(userID);
         LoginDAO dao = new LoginDAO();
         int result = dao.delete(dto);
         PrintWriter out = response.getWriter();
         if(result == 0) response.sendRedirect("./success1.html");
         else out.println("삭제에 실패하였습니다.");
      }
      else response.sendRedirect("loginmenu.html");
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }

}