package com.lanborn.lab1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LifeCycleServlet", value = "/life")
public class LifeCycleServletServlet extends HttpServlet {
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Service");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void destory() {
        System.out.println("destory");
    }
}
