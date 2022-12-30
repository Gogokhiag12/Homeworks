package com.example.finaluri;

import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.*;

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
    public boolean constainsUser2(User user){
        try {
            Class.forName(CLASS_NAME);
            Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            String query = "select username from " + TABLE_NAME + " where username = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, user.getUsername());
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
    public void updateExample(String oldUserName,
                              String name,
                              String lastName,
                              String password,
                              String profession){
        try {
            Class.forName(CLASS_NAME);
            Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            String query = "update " + TABLE_NAME + " set name = ?, lastname = ?, " +
                    " password = ?, profession = ? where username = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, profession);
            preparedStatement.setString(5, oldUserName);
            preparedStatement.executeUpdate();
        } catch (Exception e){
            System.err.println("Got You! ");
            System.err.println(e.getMessage());
        }
    }
    public User getUser(String userName){
        try {
            Class.forName(CLASS_NAME);
            Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            String query = "select * from " + TABLE_NAME + " where username = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, userName);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String firstName = rs.getString("name");
                String lastName = rs.getString("lastName");
                String currUsername = rs.getString("username");
                String password = rs.getString("password");
                String profession = rs.getString("profession");
                User user = new User();
                user.setName(firstName);
                user.setLastname(lastName);
                user.setUsername(currUsername);
                user.setPassword(password);
                user.setProfession(profession);

                return user;
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return new User();
    }
}
