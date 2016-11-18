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
@WebServlet(name = "LogoutController",urlPatterns = {"/admin/logout"})
//    "/" is for virtualization . 
public class LogoutController extends Controller {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getSession().invalidate();
            response.sendRedirect(request.getContextPath()+"/login/");
    }
    
    
    
    
}
