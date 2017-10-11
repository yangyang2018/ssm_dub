package com.zjhc.mytest_one.controller;

import com.zjhc.mytest_one.model.Student;
import com.zjhc.mytest_one.model.utils.ResponseResult;
import com.zjhc.mytest_one.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/9/28 0028.
 */
@Controller
@RequestMapping("/studentApi/")
public class MemberController {

    public static final Logger log = LoggerFactory.getLogger(MemberController.class);

    @Resource
    private StudentService studentService;

    @RequestMapping("queryAll")
    public @ResponseBody ResponseResult queryAll(@RequestParam(value = "id",required = false) String id){
        Student student = null;
        if (id !=null && !id.equals("0")){
            student = new Student();
            student.setId(new Integer(id));
        }
        ResponseResult result = studentService.findAllStudent(student);
        log.debug(result.toString());
        return result;
    }
    @RequestMapping("add")
    public ModelAndView  add(){
        System.out.println("controller  add ");
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("student/add");
        return modelAndView;
    }
}
