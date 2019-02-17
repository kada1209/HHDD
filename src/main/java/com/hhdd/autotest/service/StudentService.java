package com.hhdd.autotest.service;

import com.hhdd.autotest.entry.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/1/11.
 */

public interface StudentService {
    /**
     *得到所有的同学
     * @return
     */
    List<Student> allStudent();

    /**
     *
     * @param id 用户id
     * @return
     */
    String getStudentName(int id);

    /**
     * 插入学生
     * @param map
     * @return
     */
    Boolean insertStudent(Map<String, Object> map);

}
