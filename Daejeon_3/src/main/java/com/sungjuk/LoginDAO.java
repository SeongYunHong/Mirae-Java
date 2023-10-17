package com.sungjuk;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dbcp.DbcpBean2;

public class LoginDAO {
   private Connection conn;
   public LoginDAO() {
      conn = new DbcpBean2().getConn();
   }
   
   public int join(LoginDTO st) {
       CallableStatement stmt = null;
       int result = 0;
       try {
           String sql = "{call user_insert(?, ?, ?)}"; // 세 번째 파라미터를 추가
           stmt = conn.prepareCall(sql);
           stmt.setString(1, st.getUserID());
           stmt.setString(2, st.getPassword());
           stmt.registerOutParameter(3, java.sql.Types.INTEGER);
           stmt.execute();
           result = stmt.getInt(3);
       } catch (Exception e) {
           result = 3;
           e.printStackTrace();
       } finally {
           try {
               if (stmt != null) {
                   stmt.close();
               }
               if (conn != null) {
                   conn.close();
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
       return result;
   }
   
   
   // 아이디 얻기
   public LoginDTO getUser(String userID) throws SQLException {
      // 세팅 준비
      LoginDTO user = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
           // 연결
            String sql = "SELECT userID, password FROM user WHERE userID = ?";
            ps = conn.prepareStatement(sql);
            // 쿼리문 ? 갯수 만큼 set하기
            ps.setString(1, userID);
            rs = ps.executeQuery();
            if (rs.next()) {
                user = new LoginDTO();
                user.setUserID(rs.getString("userID"));
                user.setPassword(rs.getString("password"));
                System.out.println(user.getUserID());
                System.out.println(user.getPassword());
            }
        } finally {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        }
        return user;
    }
   
   // 사용자 비밀번호 검증하기
    public boolean validateUser(String userID, String password) throws SQLException {
       LoginDTO user = getUser(userID);
        if (user != null) {
            return user.getPassword().equals(password);
        }
        return false;
    }
   public int update(LoginDTO st) {
      CallableStatement stmt = null;
      int result = 0;
      try {
         String sql = "call user_update(?, ?, ?)";
         stmt = conn.prepareCall(sql);
         stmt.setString(1, st.getUserID());
         stmt.setString(2, st.getPassword());
         stmt.registerOutParameter(3,  java.sql.Types.INTEGER);
         
         int affectedrowcount = stmt.executeUpdate(); // 변화된 행수
         System.out.println("변화된 행수 " + affectedrowcount);
         result = stmt.getInt(3);
         stmt.close();
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         this.close();
      }
      return result;
   }
   // delete
   public int delete(LoginDTO st) {
      //Connection con = null;
      CallableStatement stmt = null;
      int result = 0;
      try {
         stmt = conn.prepareCall("{call user_delete(?,?)}");
         stmt.setString(1, st.getUserID());
         stmt.registerOutParameter(2, java.sql.Types.INTEGER);
         boolean success = stmt.execute(); // resultset이면 true
         // execute, excuteQuery(결과값 : Resultset) , excuteUpdate()결과값 : 변화된값
         // execute는 select, update, insert into, delete에 모두 사용가능
         // 그래서 resultset이 있는가 아닌가로 구분하기 위해 리턴값이 boolean이다
         // true이면 Resultset이 있고 false이면 없다.
         result = stmt.getInt(2);
      }catch(SQLException e){
         e.printStackTrace();
      }finally {
         this.close();
      }
      return result;
   }
   private void close() {
      try {
         if(conn != null && !conn.isClosed()) conn.close();
      }catch(SQLException e) { conn = null;}
   }
}