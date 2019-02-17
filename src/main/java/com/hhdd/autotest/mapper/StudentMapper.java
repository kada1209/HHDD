package com.hhdd.autotest.mapper;

import com.hhdd.autotest.entry.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);

    List<Student> getStudent();
    Student getOneStudent(@Param("id")int id);
    Boolean insertStudent(Map<String,Object> map);
}