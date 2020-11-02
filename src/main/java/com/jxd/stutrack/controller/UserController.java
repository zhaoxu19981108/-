package com.jxd.stutrack.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxd.stutrack.model.User;
import com.jxd.stutrack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-10-31 14:39:23
 */
@Controller
public class UserController{
    @Autowired
    UserService userService;

    @RequestMapping("/getLogin")
    @ResponseBody
    public int getLogin(){
        int role=-1;
        User user = new User("1001","123");
        User getuser=userService.getOne(new QueryWrapper<User>(user));
        if(null!=getuser){
            role = getuser.getRole();
        }
        return role;
    }
}