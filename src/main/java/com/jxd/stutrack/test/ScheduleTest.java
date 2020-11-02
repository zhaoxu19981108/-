package com.jxd.stutrack.test;

import com.jxd.stutrack.Application;
import com.jxd.stutrack.model.Schedule;
import com.jxd.stutrack.service.ScheduleService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Daniel
 * @version 3.0
 * @description
 * @date 2020/11/2 8:38
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= Application.class)
public class ScheduleTest {
    @Autowired
    ScheduleService scheduleService;

    @org.junit.Test
    public void addSchedule(){
        Schedule schedule = new Schedule("3期",1002);
        boolean row = scheduleService.save(schedule);
        if(row){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }

    @org.junit.Test
    public void updateSchedule(){
        Schedule schedule = new Schedule(5,"3期",1001);
        boolean row = scheduleService.updateById(schedule);
        if(row){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
    }
}
