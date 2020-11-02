package com.jxd.stutrack.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.stutrack.mapper.TeacherMapper;
import com.jxd.stutrack.model.Teacher;
import com.jxd.stutrack.service.TeacherService;
import org.springframework.stereotype.Service;

/**
 * (Teacher)表服务实现类
 *
 * @author makejava
 * @since 2020-10-31 14:39:07
 */
@Service("teacherService")
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

}