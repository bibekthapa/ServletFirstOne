package com.example.custommvc.controller.admin;

import com.example.custommvc.controller.system.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CourseController", urlPatterns = "/admin/course/*")

public class CourseController extends Controller {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        String path = "/WEB-INF/views/admin/course/";
        String page = "index.jsp";
        if (request.getRequestURI().contains("/addcourse")) {
            page = "addcourse.jsp";
            
        }
        request.getRequestDispatcher(path + page).forward(request, response);
    }}
