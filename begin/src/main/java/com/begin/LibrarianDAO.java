package com.begin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LibrarianDAO {
  public static void createlib(String[] entries){
     try {
            Connection conn = DBConnection.getConnection();
 
            String sql = "INSERT INTO librarian "
                          + "(librarian_id , librarian_name, librarian_password)" 
                          +"VALUES(? , ? , ? )"  ;
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1 , entries[0]) ;
             ps.setString(2,entries[1]) ;
             ps.setString(3, entries[2]); 
             ps.executeUpdate();
             System.out.println("Librarian Added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
  }


   public static boolean validateLogin(String librarianId, String password) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "SELECT * FROM librarian WHERE librarian_id = ? AND librarian_password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, librarianId);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            return rs.next();  // true = valid login

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
}
}