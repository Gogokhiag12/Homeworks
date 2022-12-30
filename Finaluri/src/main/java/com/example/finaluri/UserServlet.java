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

@WebServlet(name = "userServlet", value = "/user-servlet")
public class UserServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter(Constants.USERNAME);
        String password = request.getParameter("newPassword");
        String name = request.getParameter("newName");
        String lastName = request.getParameter("newSurname");
        String profession = request.getParameter("newProfession");

        DBManager dbManager = new DBManager();
        dbManager.updateExample(userName, name, lastName, password, profession);
        RequestDispatcher dispatcher = request.getRequestDispatcher("succesfulUpdate.jsp");
        request.setAttribute("newUsername", userName);
        request.setAttribute(Constants.PASSWORD, password);
        request.setAttribute(Constants.NAME, name);
        request.setAttribute(Constants.LASTNAME, lastName);
        request.setAttribute(Constants.PROFESSION, profession);
        request.setAttribute(Constants.USERNAME, userName);
        dispatcher.forward(request, response);
    }
}