<%-- 
    Document   : login
    Created on : Nov 18, 2016, 6:38:25 AM
    Author     : HOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
            <c:if test="${param.error!=null}">
                Invalid username and password
                </c:if>
                  
            <form method="post">
                

                <div>
                    <h1>Login Page</h1>
                    <label>Username</label>
                    <input type="text" name="username" required="required">
                </div>
                <div>
                    <div>  </div>
                    <label> Password</label>
                    <input type="password" name="password" required="required">
                </div>
                <button type="submit">Login</button>
            </form>
            
      
    </body>
</html>
