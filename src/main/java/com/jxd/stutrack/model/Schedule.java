package com.jxd.stutrack.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.List;

/**
 * (Schedule)表实体类
 *
 * @author Chen Yu
 * @since 2020-11-01 14:59:14
 */
@SuppressWarnings("serial")
@TableName(value = "schedule")
public class Schedule extends Model<Schedule> {
    @TableId(value="cid",type= IdType.AUTO)
    private Integer cid;
    @TableField(value="cname")
    private String cname;
    @TableField(value="tid")
    private Integer tid;

    private Teacher teacher;

    private List<Student> students;

    public Schedule() {
    }

    public Schedule(String cname, Teacher teacher, Integer tid) {
        this.cname = cname;
        this.teacher = teacher;
        this.tid = tid;
    }

    public Schedule(Teacher teacher) {
        this.teacher = teacher;
    }

    public Schedule(List<Student> students) {
        this.students = students;
    }

    public Schedule(Integer cid, String cname, Integer tid) {
        this.cid = cid;
        this.cname = cname;
        this.tid = tid;
    }

    public Schedule(String cname, Integer tid) {
        this.cname = cname;
        this.tid = tid;
    }

    public Schedule(Integer cid, String cname, Teacher teacher, Integer tid) {
        this.cid = cid;
        this.cname = cname;
        this.teacher = teacher;
        this.tid = tid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}