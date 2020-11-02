package com.jxd.stutrack.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.jxd.stutrack.mapper.ScheduleMapper;
import com.jxd.stutrack.model.Schedule;
import com.jxd.stutrack.service.ScheduleService;
import org.springframework.stereotype.Service;

/**
 * (Schedule)表服务实现类
 *
 * @author Chen Yu
 * @since 2020-11-01 14:59:15
 */
@Service("scheduleService")
public class ScheduleServiceImpl extends ServiceImpl<ScheduleMapper, Schedule> implements ScheduleService {

}