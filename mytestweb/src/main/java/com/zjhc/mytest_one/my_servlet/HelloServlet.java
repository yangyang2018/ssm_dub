package com.zjhc.mytest_one.my_servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by yangyang on 2017/9/29.
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");

        PrintWriter out = resp.getWriter();

        out.println("<h1>Hello yangyang Servlet 你好！！！！</h1>");

        out.close();

    }
}
