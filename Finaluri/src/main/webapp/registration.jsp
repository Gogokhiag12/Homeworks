<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Registration</title>
  </head>
  <body>
    <h1>Fill In Your Information To Register</h1>
    <form action="hello-servlet">
      <label for="username">Enter Username or Email: </label><br>
      <input type="text" id="username" name="username" placeholder="Username/Email" required><br><br>
      <label for="password">Enter Your Password: </label><br>
      <input type="password" id="password" name="password" placeholder="Password" required><br><br>
      <label for="confirm password">Please, Confirm Password: </label><br>
      <input type="password" id="confirm password" name="confirm password" placeholder="Repeat Password" required><br><br>
      <label for="name">Enter Your Name: </label><br>
      <input type="text" id="name" name="name" placeholder="Name" required><br><br>
      <label for="surname">Enter Your Surname: </label><br>
      <input type="text" id="surname" name="surname" placeholder="Surname" required><br><br>
      <label for="profession">Enter Your Profession</label><br>
      <input type="text" id="profession" name="profession" placeholder="Profession"><br><br>
      <input type="submit" value="Register">
    </form>
    <a href="index.jsp">Open Log in Page</a>
  </body>
</html>
