package com.zjhc.mytest_one.my_servlet;

import com.sun.tools.javac.util.ArrayUtils;
import org.springframework.util.CollectionUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

/**
 * Created by yangyang on 2017/9/29.
 */
public class AddStudentServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        req.setCharacterEncoding("utf-8");

        String name = req.getParameter("name");
        String address = req.getParameter("address");

        String [] sexs= req.getParameterValues("sex");

        System.out.println(name +":"+address);

        if(sexs!=null){
            for (String sex : sexs) {
                System.out.println("sex:"+sex);
            }
        }


    }
}
