package com.jxd.stutrack.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.stutrack.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * (Student)表服务接口
 *
 * @author makejava
 * @since 2020-10-31 14:38:49
 */
public interface StudentService extends IService<Student> {
    //分页查询所有学生信息
    List<Map<String,Object>> getAllStudents(@Param("counts") Integer counts, @Param("pagesize") Integer pagesize, @Param("sname") String sname);

    //获取学生id
    Integer getSid(Student student);
}