package com.emp.mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;

//연결 객체
import com.dbcp.DbcpBean;
public class EmpDAO {
   public static Connection getConnection() {
      Connection con = null;
      con = new DbcpBean().getConn();
      return con;
   }
   public static ArrayList<EmpDTO> getRecords(int start,int total){
      ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
      try {
         Connection con = getConnection();
         PreparedStatement ps = con.prepareStatement(
         "select EMPNO, ENAME, SAL from emp limit "+(start-1)+","+total
         );
         ResultSet rs = ps.executeQuery();
         while (rs.next()) {
            EmpDTO e = new EmpDTO();
            e.setId(rs.getInt(1));
            System.out.println(rs.getInt(1));
            e.setName(rs.getString(2));
            e.setSalary(rs.getFloat(3));
            list.add(e);
         }
         rs.close();
         con.close();
      } catch (Exception e) {
         System.out.println(e);
      }
      return list;
   }
   public boolean registerEmp (EmpDTO dto) throws ServletException{
	     Connection conn = getConnection();
	     String query = "insert into emp(EMPNO,ENAME,SAL) values (?,?,?) ";
	     System.out.println(dto.getId()); 
	     boolean success = false;
	     try {
	        PreparedStatement pstmt = conn.prepareStatement(query);
	        pstmt.setInt(1,dto.getId());
	        pstmt.setString(2, dto.getName());
	        pstmt.setFloat(3, dto.getSalary());
	        pstmt.executeUpdate();
	         pstmt.close();
	        conn.close();
	        success=true;
	     }catch(SQLException ex) {
	        success = false;
	        // throw new ServletException("등록 실패!");
	     }
	     if (success == true) return true;
	     else return false;
	  }
   public boolean updateEmp(EmpDTO dto) throws ServletException {
	      // 데이터베이스 연결을 설정
	      Connection conn = getConnection();
	      String query = "UPDATE emp SET ename=?, sal=? WHERE EMPNO=?";
	      boolean success = false;
	      try {
	         //SQL 쿼리를 준비합니다.
	         PreparedStatement pstmt = conn.prepareStatement(query);
	         pstmt.setString(1, dto.getName());
	         pstmt.setFloat(2, dto.getSalary());
	         pstmt.setInt(3, dto.getId());
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
   public boolean deleteEmp(EmpDTO dto) throws ServletException {
	      // 데이터베이스 연결을 설정
	      Connection conn = getConnection();
	      String query = "DELETE FROM emp WHERE ENAME = ?";
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