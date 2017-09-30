package com.zjhc.mytest_one.my_servlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * Created by yangyang on 2017/9/29.
 */
public class AddStudentServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*设置中文的输入输出*/
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String name = req.getParameter("name");
        String address = req.getParameter("address");
        System.out.println(name +":"+address);
        String name0 = new String(req.getParameter("name").getBytes("iso8859-1"),"utf-8");
        String address0 = new String(req.getParameter("address").getBytes("iso8859-1"),"utf-8");
        System.out.println(name0 +":"+address0);

        String [] sexs= req.getParameterValues("sex");

        if(sexs!=null) {
            for (String sex : sexs) {
                System.out.println("sex:" + sex);
            }
        }

        //重定向 浏览器请求地址
        resp.sendRedirect("http://www.baidu.com");


    }
}
