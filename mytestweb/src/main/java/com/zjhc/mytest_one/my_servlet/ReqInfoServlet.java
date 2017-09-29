package com.zjhc.mytest_one.my_servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by yangyang on 2017/9/29.
 */
public class ReqInfoServlet extends HelloServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Enumeration<String> headers = req.getHeaderNames();

        while (headers.hasMoreElements()) {
            String nextElement = headers.nextElement();

            System.out.println("消息头"+nextElement+":"+req.getHeader(nextElement));

        }


        System.out.println("请求方法"+req.getMethod());
        System.out.println("请求协议"+req.getProtocol());
        System.out.println("servlet路径"+req.getServletPath());
        System.out.println("路径信息"+req.getRequestURL());
        System.out.println("资源路径"+req.getRequestURI());
        System.out.println("端口"+req.getServerPort());
        System.out.println("上下文路径"+req.getContextPath());

    }
}
