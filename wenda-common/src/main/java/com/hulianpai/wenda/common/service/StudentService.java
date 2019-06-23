package com.hulianpai.wenda.common.service;

import com.hulianpai.wenda.common.dao.entity.Student;
import com.hulianpai.wenda.common.dao.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * StudentService
 *
 * @author Jack
 * @create 2019/6/23 下午3:26
 **/
@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public Student selectByPrimaryKey(Long id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
