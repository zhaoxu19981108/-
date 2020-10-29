package com.jxd.stutrack.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author Daniel
 * @version 3.0
 * @description
 * @date 2020/10/26 16:38
 */
@TableName(value = "emp")
public class Emp {
    @TableId(value = "id")//@TableId声明表的主键,value值对应表的字段名
    private Integer id;
    @TableField(value = "name")//@TableField注解的值对应数据库表的字段，当表的字段和实体类的属性名不一致时，需要制定对应关系
    private String name;
    @TableField(value = "pwd")
    private String pwd;

    public Emp(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public Emp() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
