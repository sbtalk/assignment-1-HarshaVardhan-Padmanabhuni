package com.demo.jdbc;

import java.sql.*;

public class StudentInsert {
    public static void main(String[] args) {
        String insertSQL = "INSERT INTO Student(id, name, age) VALUES (?, ?, ?)";
        String selectSQL = "SELECT * FROM Student";

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3307/harshadb", "root", "root");
             PreparedStatement pst = conn.prepareStatement(insertSQL);
             Statement stmt = conn.createStatement()) {
            conn.setAutoCommit(false);

            try {

                pst.setInt(1, 206);
                pst.setString(2, "Harsha");
                pst.setInt(3, 20);
                pst.addBatch();

                pst.setInt(1, 207);
                pst.setString(2, "Adithya");
                pst.setInt(3, 22);
                pst.addBatch();

                pst.setInt(1, 208);
                pst.setString(2, "Charan");
                pst.setInt(3, 19);
                pst.addBatch();

                pst.setInt(1, 209);
                pst.setString(2, "Himalay");
                pst.setInt(3, 21);
                pst.addBatch();

                pst.setInt(1, 210);
                pst.setString(2, "Vignesh");
                pst.setInt(3, 23);
                pst.addBatch();


                int[] results = pst.executeBatch();
                conn.commit();

                System.out.println("Batch insert completed. Rows affected:");
                for (int count : results) {
                    System.out.println(count);
                }

            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Transaction rolled back due to error.");
                e.printStackTrace();
            } finally {
                conn.setAutoCommit(true);
            }
            ResultSet rs = stmt.executeQuery(selectSQL);
            System.out.println("\n=== Student Records ===");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println(id + " | " + name + " | " + age);
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}