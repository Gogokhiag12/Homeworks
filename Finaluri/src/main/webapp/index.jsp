<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Log in to Website</title>
    </head>
    <body>

    <form action="hello-servlet">
        <label for="username">Enter User name or email: </label><br>
        <input type="text" id="username" name="username" required><br>
        <label for="password">Enter your Password: </label><br>
        <input type="password" id="password" name="password" required><br><br>
        <input type="submit" value="Log in">
    </form>

    <a href=registration.jsp>Register</a>

    </body>
</html>