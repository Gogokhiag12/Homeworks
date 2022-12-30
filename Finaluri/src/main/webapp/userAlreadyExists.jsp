<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Incorrect Password</title>
</head>
<body>
<h1>User with this username/email already exists</h1>
<form action="registration-servlet">
  <label for="username">Enter Username or Email: </label><br>
  <input type="text" id="username" name="username" placeholder="Username/Email" required><br><br>
  <label for="password">Enter Your Password: </label><br>
  <input type="password" id="password" name="password" placeholder="Password" required><br><br>
  <label for="confirm password">Please, Confirm Password: </label><br>
  <input type="password" id="confirm password" name="confirm password" placeholder="Repeat Password" required><br><br>
  <label for="name">Enter Your Name: </label><br>
  <input type="text" id="name" name="name" placeholder="Name" required><br><br>
  <label for="lastname">Enter Your Surname: </label><br>
  <input type="text" id="lastname" name="lastname" placeholder="Lastname" required><br><br>
  <label for="profession">Enter Your Profession</label><br>
  <input type="text" id="profession" name="profession" placeholder="Profession"><br><br>
  <input type="submit" value="Register">
</form>
<a href="index.jsp">Open Log in Page</a>
</body>
</html>
