package com.hulianpai.wenda.admin.controller;

import com.hulianpai.wenda.common.dao.entity.Student;
import com.hulianpai.wenda.common.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * StudentController
 *
 * @author Jack
 * @create 2019/6/23 下午3:28
 **/
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/{id}")
    public Student get(@PathVariable Long id) {
        return studentService.selectByPrimaryKey(id);
    }
}
