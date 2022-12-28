package com.example.finaluri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBManager {
    private final String CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    private final String DATABASE_NAME = "finaldatabase";
    private final String URL = "jdbc:mysql://localhost/" + DATABASE_NAME;
    private final String USER_NAME = "root";
    private final String PASSWORD = "JUpeHkp2";
    private final String TABLE_NAME = "user";
    public boolean constainsUser(User user){
        try {
            Class.forName(CLASS_NAME);
            Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            String query = "select * from " + TABLE_NAME + " where username = ? and password = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, user.getUsername());
            pst.setString(2, user.getPassword());
            System.out.println(query);
            System.out.println(user.getUsername());
            ResultSet rs = pst.executeQuery();
            return rs.next();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return false;
    }
    public boolean insert(User user){
        try {
            Class.forName(CLASS_NAME);
            Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement("insert into user(name, lastname, username, password, profession) " +
                    "values(?, ?, ?, ?, ?)");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getLastname());
            preparedStatement.setString(3, user.getUsername());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5, user.getProfession());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return false;
    }
}
