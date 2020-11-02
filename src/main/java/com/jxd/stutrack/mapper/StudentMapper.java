package com.jxd.stutrack.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.stutrack.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * (Student)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-31 14:38:49
 */
@Repository
public interface StudentMapper extends BaseMapper<Student> {
    //分页查询所有学生信息
    List<Map<String,Object>> getAllStudents(@Param("counts") Integer counts,@Param("pagesize") Integer pagesize, @Param("sname") String sname);

    //获取学生id
    Integer getSid(Student student);
}