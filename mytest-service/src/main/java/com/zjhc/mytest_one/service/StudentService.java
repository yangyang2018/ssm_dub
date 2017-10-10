package com.zjhc.mytest_one.service;

import com.zjhc.mytest_one.model.Student;
import com.zjhc.mytest_one.model.utils.ResponseResult;

import java.util.List;

/**
 * Created by Administrator on 2017/9/18 0018.
 */
public interface StudentService {

    /**
     * 添加学生 * @param student * @return
     */
    ResponseResult addStudent(Student student);

    /**
     * 根据ID删除学生 * @param id * @return
     */
    ResponseResult deleteStudentById(Integer id);

    /**
     * 根据ID修改学生信息 * @param student * @return
     */
    ResponseResult updateStudentById(Student student);

    /**
     * 按条件查找所有学生 * @param student * @return
     */
    ResponseResult findAllStudent(Student student);
}
