<%-- 
    Document   : index
    Created on : Nov 15, 2016, 10:36:02 AM
    Author     : HOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello <%=request.getAttribute("name") %></h1>
    </body>
</html>
