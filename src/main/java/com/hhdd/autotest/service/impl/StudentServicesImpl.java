package com.hhdd.autotest.service.impl;

import com.hhdd.autotest.entry.Student;
import com.hhdd.autotest.mapper.StudentMapper;
import com.hhdd.autotest.service.StudentService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/1/11.
 */
@Service("StudentServiceImpl")
public class StudentServicesImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> allStudent() {
        List<Student> list = studentMapper.getStudent();
        return list;
    }

    @Override
    public String getStudentName(int id) {
        Student student = studentMapper.getOneStudent(id);
        if (null != student) {
            String name = student.getSname();

            return name;
        }else{
            return null;
        }

    }

    @Override
    public Boolean insertStudent(Map<String, Object> map) {
        Boolean result = studentMapper.insertStudent(map);
        return result;
    }


}
