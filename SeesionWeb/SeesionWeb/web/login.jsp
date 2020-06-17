<%-- 
    Document   : login.jsp
    Created on : Oct 30, 2019, 10:18:33 AM
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
        Name:<input type="text" name="name"><br>  
        Password:<input type="password" name="password"><br>  
        <input type="submit" value="login">  
        </form>  
    </body>
</html>
