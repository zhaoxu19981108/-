package com.jxd.stutrack.controller;

import com.jxd.stutrack.model.Emp;
import com.jxd.stutrack.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Daniel
 * @version 3.0
 * @description
 * @date 2020/10/29 15:04
 */
@Controller
public class EmpController {
    @Autowired
    IEmpService iEmpService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        String str = "success";
        List<Emp> emps = iEmpService.list();
        return str;
    }
}
