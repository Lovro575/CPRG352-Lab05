<%-- 
    Document   : home
    Created on : Oct 12, 2021, 3:24:38 PM
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
        <h1>Home Page</h1>
        <form method="POST" action="login">
       <%-- Session object--%>
            <label>Hello ${usernameSession}</label> 
            <div nam> <a href="login">Log out</a> </div>
        </form>
        

    </body>
</html>
