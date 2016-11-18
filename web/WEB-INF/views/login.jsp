<%-- 
    Document   : login
    Created on : Nov 18, 2016, 6:38:25 AM
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
        <div class="container">
        <form method="post">
           
            <div>
                 <h1>Login Page</h1>
            <label>Username</label>
            <input type="text" name="username" required="required">
            </div>
            <div>
                <div>        </div>
            <label> Password</label>
            <input type="password" name="password" required="required">
            </div>
            </form>
        <button type="submit">Login</button>
        </div>
    </body>
</html>
