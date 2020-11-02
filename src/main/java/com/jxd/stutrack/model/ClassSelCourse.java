package com.jxd.stutrack.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Classselcourse)表实体类
 *
 * @author makejava
 * @since 2020-10-31 14:36:49
 */
@SuppressWarnings("serial")
@TableName(value="classselcourse")
public class ClassSelCourse extends Model<ClassSelCourse> {
    @TableId(value="id",type= IdType.AUTO)
    private Integer id;
    @TableField(value="cid")
    private Integer cid;
    @TableField(value="courseid")
    private Integer courseid;

    public ClassSelCourse(Integer cid, Integer courseid) {
        this.cid = cid;
        this.courseid = courseid;
    }

    public ClassSelCourse(Integer id, Integer cid, Integer courseid) {
        this.id = id;
        this.cid = cid;
        this.courseid = courseid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

}