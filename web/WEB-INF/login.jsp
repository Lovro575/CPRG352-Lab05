<%-- 
    Document   : login
    Created on : Oct 12, 2021, 3:23:56 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MyLogin</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="POST" action="home">
            <label>Username:</label>
            <input type="text" name="username" value="">
            <br>
            <label>Password:</label>
            <input type="text" name="password" value="">
            <br>
            <input type="submit" name="login" value="Log in">
            <br>
            <label>${invalidInput}</label>
            
        </form>
    </body>
</html>
