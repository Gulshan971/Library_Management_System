package com.begin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
  public static void addBook(String[] record) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO books (Book_id, Book_author, Book_name, Book_price, Book_edition, Book_isbn) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, record[0]);
            ps.setString(2, record[1]);
            ps.setString(3, record[2]);
            ps.setDouble(4, Double.parseDouble(record[3]));
            ps.setString(5, record[4]);
            ps.setString(6, record[5]);
           

            ps.executeUpdate();
            System.out.println("Book Added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     public static List<AllBooks> getAllBooks() {
        List<AllBooks> books = new ArrayList<>();
        String sql = "SELECT * FROM books"; // assuming your table name is 'books'

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                books.add(new AllBooks(
                        rs.getString("Book_Isbn"),
                        rs.getString("Book_author"),
                        rs.getString("Book_edition"),
                        rs.getString("Book_id"),
                        rs.getString("Book_name"),
                        rs.getDouble("Book_price")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }
}
