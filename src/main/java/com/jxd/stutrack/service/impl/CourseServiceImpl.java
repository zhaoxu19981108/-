package com.jxd.stutrack.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.jxd.stutrack.mapper.CourseMapper;
import com.jxd.stutrack.model.Course;
import com.jxd.stutrack.service.CourseService;
import org.springframework.stereotype.Service;

/**
 * (Course)表服务实现类
 *
 * @author Chen Yu
 * @since 2020-11-01 14:59:42
 */
@Service("courseService")
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {

}