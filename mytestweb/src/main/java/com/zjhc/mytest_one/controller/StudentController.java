package com.zjhc.mytest_one.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/10/11 0011.
 */
@Controller
@RequestMapping("/student/")
public class StudentController {

    @RequestMapping("home")
    public String  home(Model model){
        model.addAttribute("menuSelected1","home");
        return "student/home";
    }
    @RequestMapping("studentList")
    public String studentInfo (Model model){
        model.addAttribute("menuSelected1", "studentInfo");
        return "student/studentList";}
}
