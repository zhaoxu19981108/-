package com.jxd.stutrack.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxd.stutrack.mapper.UserMapper;
import com.jxd.stutrack.model.Student;
import com.jxd.stutrack.model.User;
import com.jxd.stutrack.service.StudentService;
import com.jxd.stutrack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2020-10-31 14:38:49
 */
@Controller
public class StudentController extends ApiController {
    @Autowired
    StudentService studentService;
    @Autowired
    UserService userService;

    //分页查询所有的学生信息
    @RequestMapping("getAllStudent/{curPage}/{pagesize}/{sname}")
    @ResponseBody
    public List<Map<String,Object>> getAllStudent(@PathVariable("curPage") String curPage, @PathVariable("pagesize") String pagesize, @PathVariable("sname") String sname){
        Integer counts = (Integer.parseInt(curPage)-1)*Integer.parseInt(pagesize);
        List<Map<String,Object>> resultValue = studentService.getAllStudents(counts,Integer.parseInt(pagesize),sname);
        return resultValue;
    }

    //添加学生信息
    @RequestMapping("addStudent")
    @ResponseBody
    public String addStudent(@RequestBody Student student){
        String str = "添加失败";
        if(studentService.save(student)){
            Integer sid = studentService.getSid(student);
            User user = new User(sid.toString(),"123",1);
            if(userService.save(user)){
                str = "添加成功";
            }else{
                str = "添加学生信息成功，添加登录信息失败";
            }
        }
        return str;
    }

    //通过id修改学生信息
    @RequestMapping("updateStudentById")
    @ResponseBody
    public String updateStudentById(@RequestBody Student student){
        String str = "修改失败";
        if(studentService.updateById(student)){
            str = "修改成功";
        }
        return str;
    }

    //通过id删除学生信息
    @RequestMapping("deleteStudentById")
    @ResponseBody
    public String deleteStudentById(@RequestBody String sid){
        String str = "删除失败";
        if(studentService.removeById(sid)){
            str = "删除成功";
        }
        return str;
    }
}