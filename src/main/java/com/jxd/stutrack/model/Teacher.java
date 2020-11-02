package com.jxd.stutrack.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.List;

/**
 * (Teacher)表实体类
 *
 * @author makejava
 * @since 2020-10-31 14:39:07
 */
@TableName(value = "teacher")
public class Teacher extends Model<Teacher> {
    @TableId(value = "tid",type= IdType.AUTO)
    private Integer tid;
    @TableField(value = "tname")
    private String tname;
    @TableField(value = "sex")
    private String sex;
    @TableField(value = "age")
    private Integer age;

    private List<Schedule> schedules;

    public Teacher(String tname, String sex, Integer age) {
        this.tname = tname;
        this.sex = sex;
        this.age = age;
    }

    public Teacher(Integer tid, String tname, String sex, Integer age) {
        this.tid = tid;
        this.tname = tname;
        this.sex = sex;
        this.age = age;
    }

    public Teacher() {
    }

    public Teacher(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }
}