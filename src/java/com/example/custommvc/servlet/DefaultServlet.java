/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.custommvc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HOME
 */
public class DefaultServlet extends HttpServlet{
    String path="/WEB-INF/views/";
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
    {
        String name="Bibek Thapa";
        request.setAttribute("name", name);
        request.getRequestDispatcher(path+"index.jsp").forward(request, response);
    
    }
    
    
}
