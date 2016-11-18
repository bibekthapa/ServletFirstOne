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
    <%@include file="header.jsp" %>
   
    
            <div class="pull-right">
            <p>
                <a href="addcourse" class=" btn btn-primary"> <span class="glyphicon glyphicon-plus"></span></a>
            </p>
              </div>
        <table class="table table-bordered table-striped table-hover">
            <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Description</th>
            <th>Fees</th>
            <th>Status</th>
            <tr>
                <c:forEach var="course" items="${requestScope.courses}">
                
                
            <tr>
                <td>${course.id} </td>
                <td>${course.name}</td>
                <td>${course.description}</td>
                <td>${course.fees}</td>
                <td>${course.status}</td>
                
            </tr>
            
            </c:forEach>
            
        </table>
             <form method="post" >
                 <input type="text" required="required" name="name">
            <button class="btn btn-success" type="submit"> Save</button>
        </form>
      
    <%@include file="footer.jsp" %>
