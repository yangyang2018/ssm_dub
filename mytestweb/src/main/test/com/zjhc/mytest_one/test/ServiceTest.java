package com.zjhc.mytest_one.test;

import com.zjhc.mytest_one.model.Student;
import com.zjhc.mytest_one.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
public class ServiceTest extends BaseTest{

    @Resource
    private StudentService studentService;

//    @Test
    public void addTest() throws Exception {
        Student student=new Student();
         student.setName("李同学");
         student.setSex(false);
         student.setAddress("北京");
         System.out.println(studentService.addStudent(student));
    }
    @Test
    public void selectTest() throws Exception {
        Student student=new Student();
        List<Student> list = studentService.findAllStudent(student);
        for (Student student1 : list) {

            System.out.println(student1);
        }
    }






}
