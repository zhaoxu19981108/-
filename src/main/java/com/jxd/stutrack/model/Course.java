package com.jxd.stutrack.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Course)表实体类
 *
 * @author Chen Yu
 * @since 2020-11-01 14:59:42
 */
@SuppressWarnings("serial")
@TableName(value="course")
public class Course extends Model<Course> {

    @TableId(value="courseid",type= IdType.AUTO)
    private Integer courseid;
    @TableField(value="coursename")
    private String coursename;
    @TableField(value="coursestate")
    private Integer coursestate;//0为正常，1为假删状态

    public Course() {
    }

    public Course(String coursename) {
        this.coursename = coursename;
    }

    public Course(Integer courseid, String coursename) {
        this.courseid = courseid;
        this.coursename = coursename;
    }

    public Course(Integer courseid, String coursename, Integer coursestate) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.coursestate = coursestate;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Integer getCoursestate() {
        return coursestate;
    }

    public void setCoursestate(Integer coursestate) {
        this.coursestate = coursestate;
    }

}