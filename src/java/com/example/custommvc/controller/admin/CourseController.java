package com.example.custommvc.controller.admin;

import com.example.custommvc.controller.system.Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CourseController",urlPatterns = "/admin/course/*")

public class CourseController extends Controller{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("<h1>You are in secured area</h1>");
    }
  
}
