package com.example.finaluri;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter(Constants.USERNAME);
        String password = request.getParameter(Constants.PASSWORD);
        User user = new User();
        user.setUsername(userName);
        user.setPassword(password);
        DBManager dbManager = new DBManager();
        if (dbManager.constainsUser(user)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("userPage.jsp");
            request.setAttribute(Constants.USERNAME, userName);
            request.setAttribute(Constants.PASSWORD, password);
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("incorrectLogin.jsp");
            request.setAttribute(Constants.USERNAME, userName);
            request.setAttribute(Constants.PASSWORD, password);
            dispatcher.forward(request, response);
        }
    }
}