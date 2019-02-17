package com.hhdd.autotest.controller;

import com.hhdd.autotest.entry.Student;
import com.hhdd.autotest.service.StudentService;
import com.hhdd.autotest.utils.ResultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/1/11.
 */
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping("/studentList")
    private List<Student> getStudent(){
        List<Student> studentList = studentService.allStudent();
        return studentList;
    }
    @RequestMapping("/getName")
    private ResultMessage getName(@RequestParam(name="id")int id){
        String name = studentService.getStudentName(id);
        if (name!=null){
            return new ResultMessage(200,"操作成功",name);
        }
        return  new ResultMessage(400, "操作失败");

    }

    @RequestMapping("/insertStudent")
    private Boolean insertStudent(@RequestParam Map<String,Object> map){
        int i = Integer.valueOf((String) map.get("sage"));
        System.out.println(i);
        Boolean resulet = studentService.insertStudent(map);
        return resulet;
    }

}
