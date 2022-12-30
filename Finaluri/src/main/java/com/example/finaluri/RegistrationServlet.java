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

@WebServlet(name = "registrationServlet", value = "/registration-servlet")
public class RegistrationServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter(Constants.USERNAME);
        String password = request.getParameter(Constants.PASSWORD);
        String confirmPassword = request.getParameter(Constants.CONFIRMPASSWORD);
        String name = request.getParameter(Constants.NAME);
        String lastname = request.getParameter(Constants.LASTNAME);
        String profession = request.getParameter((Constants.PROFESSION));
        User user = new User();
        user.setName(name);
        user.setLastname(lastname);
        user.setUsername(userName);
        user.setPassword(password);
        user.setProfession(profession);
        DBManager dbManager = new DBManager();
        if (dbManager.constainsUser2(user)){
            RequestDispatcher dispatcher = request.getRequestDispatcher("userAlreadyExists.jsp");
            dispatcher.forward(request, response);
        } else if (password.equals(confirmPassword)) {
            dbManager.insert(user);
            RequestDispatcher dispatcher = request.getRequestDispatcher("userPage.jsp");
            request.setAttribute(Constants.USERNAME, userName);
            request.setAttribute(Constants.PASSWORD, password);
            request.setAttribute(Constants.NAME, name);
            request.setAttribute(Constants.LASTNAME, lastname);
            request.setAttribute(Constants.PROFESSION, profession);
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("incorrectRegistration.jsp");
            dispatcher.forward(request, response);
        }
    }
}