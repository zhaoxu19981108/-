package com.jxd.stutrack.test;

import com.jxd.stutrack.Application;
import com.jxd.stutrack.model.Student;
import com.jxd.stutrack.service.StudentService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Daniel
 * @version 3.0
 * @description
 * @date 2020/11/2 9:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= Application.class)
public class StudentTest {
    @Autowired
    StudentService studentService;

    @org.junit.Test
    public void addStudent(){

//        Student student = new Student("张三","女","汉族",,"山东省青岛市","否","18812341234","山东科技大学","机械工程","",5,"");
    }
}
