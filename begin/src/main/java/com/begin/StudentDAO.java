package com.begin;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

public class StudentDAO {
     public static void addStudent(String[] record) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO students "
                    + "(Student_id, Student_name, Student_department, Student_Batch, Student_Password, Student_Phone_Number) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, record[0]);   // id
            ps.setString(2, record[1]);   // name
            ps.setString(3, record[2]);   // department
            ps.setString(4, record[3]);   // batch
            ps.setString(5, record[4]);   // password
            ps.setString(6, record[5]);   // phone number

            ps.executeUpdate();
            System.out.println("Student Added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     public static boolean validateLogin(String studentId, String password) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "SELECT * FROM students WHERE Student_id = ? AND Student_Password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, studentId);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            return rs.next();  // true = valid login

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void issueBook(String studentId, String bookId, LocalDate dueDate) {
    try {
        Connection conn = DBConnection.getConnection();

        String sql = "INSERT INTO issue_records (student_id, book_id, issue_date, due_date, status) VALUES (?, ?, CURDATE(), ?, 'ISSUED')";
        
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, studentId);
        ps.setString(2, bookId);
        ps.setDate(3, Date.valueOf(dueDate));

        ps.executeUpdate();
        System.out.println("Book issued successfully!");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
