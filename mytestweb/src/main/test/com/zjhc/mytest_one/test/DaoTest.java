package com.zjhc.mytest_one.test;

import com.zjhc.mytest_one.dao.StudentDao;
import com.zjhc.mytest_one.model.Student;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
public class DaoTest extends BaseTest{

    @Resource
    private StudentDao studentDao;

    @Test
    public void addTest(){
        Student student=new Student();
        student.setName("李同学");
        student.setSex(false);
        student.setAddress("北京");
        System.out.println(studentDao.insert(student));
    }


}
