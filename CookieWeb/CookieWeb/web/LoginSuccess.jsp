<%-- 
    Document   : LoginSuccess.jsp
    Created on : Oct 30, 2019, 12:27:16 PM
    Author     : n01316980
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Success Page</title>
</head>
<body>
<%
String message = null;
String sessionID = null;
Cookie[] cookies = request.getCookies();
if(cookies != null){
for(Cookie cookie : cookies){
	if(cookie.getName().equals("message")) message = cookie.getValue();
	if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
}
}
%>
<h3>Login Success</h3>
<h4><%=message%></h4>
<h4>Session ID = <%=sessionID %></h4>
<br><br>
<form action="LogoutSevlet" method="post">
<input type="submit" value="Logout" >
</form>
</body>
</html>
