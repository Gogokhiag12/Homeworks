<%@ page import="com.example.finaluri.Constants" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Succesful</title>
  </head>
  <body>
    <form action="registration-servlet">
    <h1>Your Registration Was Succesful</h1>
    <h1>Name: <%= request.getAttribute(Constants.NAME) %> </h1><br>
    <h1>Lastname: <%= request.getAttribute(Constants.LASTNAME) %> </h1><br>
    <h1>Username: <%= request.getAttribute(Constants.USERNAME) %> </h1><br>
    <h1>Profession: <%= request.getAttribute(Constants.PROFESSION) %> </h1><br>
    </form>
  <a href="index.jsp">Log Out</a>
  </body>
</html>
