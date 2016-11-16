<%-- 
    Document   : index
    Created on : Nov 15, 2016, 10:36:02 AM
    Author     : HOME
--%>


<%@page import="com.example.custommvc.entity.Course"%>
<%@page import="com.example.custommvc.impl.CourseDaoimpl"%>
<%@page import="com.example.custommvc.dao.CourseDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </head>
    <body>
        <h1>${requestScope.course.getName() }</h1>
        <div class="container">
        <table class="table table-bordered table-striped table-hover">
            <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Description</th>
            <th>Fees</th>
            <th>Status</th>
            <tr>
                <%  CourseDao coursedao=new CourseDaoimpl();
                    for(Course c: coursedao.getAll()){
                
                %>
                
                
            <tr>
                <td><%=c.getId() %> </td>
                <td><%=c.getName()%></td>
                <td><%=c.getDescription()%></td>
                <td><%=c.getFees()%></td>
                <td><%=c.getStatus()%></td>
                
            </tr>
            
            <%}%>
            
        </table>
        </div>
    </body>
</html>
