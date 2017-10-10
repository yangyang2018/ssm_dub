package com.zjhc.mytest_one.service.impl;

import com.zjhc.mytest_one.dao.StudentDao;
import com.zjhc.mytest_one.model.Student;
import com.zjhc.mytest_one.model.utils.ResponseResult;
import com.zjhc.mytest_one.service.StudentService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
@Service("StudentService")
public class StudentServiceImpl implements StudentService
{
    @Resource
    private StudentDao studentDao;

    public ResponseResult addStudent(Student student) {
        ResponseResult responseResult = new ResponseResult();
        boolean bool = studentDao.insert(student);
        if (bool == true){
            responseResult.setSuccess(true);
        }
        return responseResult;
    }

    public ResponseResult deleteStudentById(Integer id) {
        ResponseResult responseResult = new ResponseResult();
        Student  student =new Student();
        student.setId(id);
        boolean bool = studentDao.delete(student);
        if (bool == true){
            responseResult.setSuccess(true);
        }
        return responseResult;
    }

    public ResponseResult updateStudentById(Student student) {
        ResponseResult responseResult = new ResponseResult();
        boolean bool = studentDao.update(student);
        if (bool == true){
            responseResult.setSuccess(true);
        }
        return responseResult;
    }

    public ResponseResult findAllStudent(Student student) {
        ResponseResult responseResult = new ResponseResult();
        List<Student> students = studentDao.select(student);
        if (CollectionUtils.isNotEmpty(students)){
            responseResult.setSuccess(true);
            responseResult.setData(students);
        }else {
            responseResult.setMessage("没有数据");
        }
        return responseResult;
    }
}
