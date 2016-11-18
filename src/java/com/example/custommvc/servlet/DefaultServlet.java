/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.custommvc.servlet;

import com.example.custommvc.dao.CourseDao;
import com.example.custommvc.entity.Course;
import com.example.custommvc.impl.CourseDaoimpl;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CourseController",urlPatterns = "/admin/courselist")
public class DefaultServlet extends HttpServlet{
    String path="/WEB-INF/views/";
    CourseDao coursedao=new CourseDaoimpl();
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
    {
        try {
            request.setAttribute("courses", coursedao.getAll());
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        } catch (SQLException ex) {
                ex.getMessage();
        }
        request.getRequestDispatcher(path+"index.jsp").forward(request, response);
    
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
           
            // PrintStream ps=new PrintStream(response.getOutputStream());
          //ps.println("Hello world");
    }
    
    
    
}
