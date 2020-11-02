package com.jxd.stutrack.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.stutrack.mapper.StudentMapper;
import com.jxd.stutrack.model.Student;
import com.jxd.stutrack.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2020-10-31 14:38:49
 */
@Service("studentService")
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Map<String, Object>> getAllStudents(Integer counts, Integer pagesize, String sname) {
        return studentMapper.getAllStudents(counts,pagesize,sname);
    }

    @Override
    public Integer getSid(Student student) {
        return studentMapper.getSid(student);
    }
}