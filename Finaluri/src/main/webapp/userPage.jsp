<%@ page import="com.example.finaluri.Constants" %>
<%@ page import="com.example.finaluri.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>USER PAGE </title>
    </head>
    <body>
        <h1>Welcome <%= request.getAttribute(Constants.USERNAME) %> </h1>
        <form action="user-servlet">
            <label for="newUsername">Enter New Username or Email: </label><br>
            <input type="text" id="newUsername" name="newUsername" placeholder="New Username/Email" ><br><br>
            <label for="newPassword">Enter New Password: </label><br>
            <input type="password" id="newPassword" name="newPassword" placeholder="New Password" ><br><br>
            <label for="newName">Enter New Name: </label><br>
            <input type="text" id="newName" name="newName" placeholder="New Name" ><br><br>
            <label for="newSurname">Enter New Surname: </label><br>
            <input type="text" id="newSurname" name="newSurname" placeholder="New Surname" ><br><br>
            <label for="newProfession">Enter New Profession</label><br>
            <input type="text" id="newProfession" name="newProfession" placeholder="New Profession"><br><br>
            <input type="submit" value="Update"><br>
        </form>
        <a href=index.jsp>Log Out</a>
    </body>
</html>
