package com.student.mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;

import com.dbcp.DbcpBean_;
import com.student.mariadb.StudentDTO;

public class StudentDAO {
	public static Connection getConnection() {
	      Connection con = null;
	      con = new DbcpBean_().getCoon();
	      return con;
	   }
	   public static ArrayList<StudentDTO> getRecords(){
	      ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
	      try {
	         Connection con = getConnection();
	         PreparedStatement ps = con.prepareStatement("select bunho, name, kor, mat, eng, total, average, grade from student");
	         ResultSet rs = ps.executeQuery();
	         while (rs.next()) {
	        	 StudentDTO e = new StudentDTO();
	        	 e.setId(rs.getInt(1));
	        	 System.out.println(rs.getInt(1));
	        	 e.setName(rs.getString(2));
	        	 e.setKor(rs.getInt(3));
	        	 e.setMat(rs.getInt(4));
	        	 e.setEng(rs.getInt(5));
	        	 e.setTotal(rs.getInt(6));
	        	 e.setAverage(rs.getFloat(7));
	        	 e.setGrade(rs.getString(8));
	        	 list.add(e);
	         }
	         rs.close();
	         con.close();
	      } catch (Exception e) {
	         System.out.println(e);
	      }
	      return list;
	   }
	   public boolean registerStudent(StudentDTO dto) throws ServletException{//입력
		   Connection conn = getConnection();
		   String query = "INSERT INTO student(name,kor,mat,eng,schoolcode) VALUES(?,?,?,?,?)"; 
		   System.out.println(dto.getName());
		   boolean success=false;
		   try { //exception 처리를 요하는 명령어
			   PreparedStatement pstmt = conn.prepareStatement(query);//PreparedStatement db 틀을 해석해주는 것
			   
			   pstmt.setString(1, dto.getName());
			   pstmt.setInt(2, dto.getKor());
			   pstmt.setInt(3,dto.getMat());
			   pstmt.setInt(4,dto.getEng());
			   pstmt.setString(5,dto.getSchoolcode());
			   pstmt.executeUpdate();
			   pstmt.close();
			   conn.close();
			   success=true;
		   }catch(SQLException ex) {
			   success=false;
			   //throw new ServletException("등록 실패!");
		   }
		   if(success=true) return true;
		   else return false;
	   }
	   public boolean updateStudent(StudentDTO dto) throws ServletException {
		      Connection conn = getConnection();
		      String query = "UPDATE student SET name=?, kor=?, mat=?, eng=? WHERE bunho=?";
		      boolean success = false;
		      try {
		         //SQL 쿼리를 준비합니다.
		         PreparedStatement pstmt = conn.prepareStatement(query);
		         pstmt.setString(1, dto.getName());
		         pstmt.setInt(2, dto.getKor());
		         pstmt.setInt(3, dto.getMat());
		         pstmt.setInt(4, dto.getEng());
		         pstmt.setInt(5, dto.getId());
		         int result = pstmt.executeUpdate();
		         System.out.println("수정 된거 : "+result);
		         pstmt.close();
		         conn.close();
		         if (result > 0)   success = true; // 적어도 1개의 레코드가 업데이트되었을 때 성공으로 간주
		         else success = false;
		      }
		      catch (Exception e) {
		         // throw new ServletException("등록 실패!");
		         success = false;
		      } 
			if (success == true) return true;
			else return false;
	   }
	   public boolean deleteStudent(StudentDTO dto) throws ServletException {
		      // 데이터베이스 연결을 설정
		      Connection conn = getConnection();
		      String query = "DELETE FROM student WHERE name = ?";
		      boolean success = false;
		      try {
		         //SQL 쿼리를 준비합니다.
		         PreparedStatement pstmt = conn.prepareStatement(query);
		         pstmt.setString(1, dto.getName());
		         int result = pstmt.executeUpdate();
		         System.out.println("삭제 된거 : "+result);
		         pstmt.close();
		         conn.close();
		         if (result > 0)   success = true; // 적어도 1개의 레코드가 업데이트되었을 때 성공으로 간주
		         else success = false;
		      } catch (Exception e) {
		         // throw new ServletException("등록 실패!");
		         success = false;
		      } 
		      if (success == true) return true;
		      else return false;
		   }
}
