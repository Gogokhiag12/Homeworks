<%@ page import="com.example.finaluri.Constants" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Wrong Email Or Password</title>
  </head>
  <body>
    <h1>Either username or password was incorrect, please try again</h1>
    <form action="hello-servlet">
      <label for="username">Enter username or email: </label><br>
      <input type="text" id="username" name="username" required><br>
      <label for="password">Enter your Password: </label><br>
      <input type="password" id="password" name="password" required><br><br>
      <input type="submit" value="Log in">
    </form>

    <a href=registration.jsp>Register</a>

  </body>
</html>