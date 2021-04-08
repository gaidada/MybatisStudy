package com.gai.dao;

import com.gai.pojo.Student;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface StudentMapper {

    //查询所有的学生信息及对应的老师信息
    public List<Student> getStudent();
    public List<Student> getStudent2();


}
