/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.custommvc.controller;

import com.example.custommvc.controller.system.Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HOME
 */
@WebServlet(name = "LoginController",urlPatterns = {"/login/*"})
//    "/" is for virtualization . 
public class LoginController extends Controller {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
            
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String username=request.getParameter("username");
            String password=request.getParameter("password");
            if(username.equalsIgnoreCase("admin")&& password.equalsIgnoreCase("admin"))
            {
               HttpSession session=request.getSession(true);
               session.setAttribute("user", username);
                System.out.println(username);
               response.sendRedirect(request.getContextPath()+"/admin/course");
               
            }
            else
            {
                response.sendRedirect(request.getContextPath()+"/login/?error");
            }
    }
    
    
    
}
