package com.zjhc.mytest_one.controller;

import com.zjhc.mytest_one.model.Student;
import com.zjhc.mytest_one.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/9/28 0028.
 */
@Controller
@RequestMapping("/student")
public class MemberController {

    @Resource
    private StudentService studentService;

    @RequestMapping("query/all")
    public ModelAndView  queryAll(){
        List<Student> list = studentService.findAllStudent(null);
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.addObject("label","shabi");
        modelAndView.addObject("students",list);
        System.out.println(list);
        modelAndView.setViewName("student/list");
        return modelAndView;
    }
    @RequestMapping("add")
    public ModelAndView  add(){
        System.out.println("controller  add ");
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("student/add");
        return modelAndView;
    }
}
