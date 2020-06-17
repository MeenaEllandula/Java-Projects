<%-- 
    Document   : loginPage
    Created on : Oct 30, 2019, 12:24:58 PM
    Author     : n01316980
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="LoginServlet" method="post">

    Username: <input type="text" name="username">
    <br>
    Password: <input type="password" name="pwd">
    <br><br>
    <input type="submit" value="Login">
</form>
    </body>
</html>
