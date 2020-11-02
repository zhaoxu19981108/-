package com.jxd.stutrack.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Comment)表实体类
 *
 * @author Chen Yu
 * @since 2020-10-31 15:35:34
 */
@TableName(value = "comment")
public class Comment extends Model<Comment> {
    @TableId(value = "eid")
    private Integer eid;
    @TableId(value = "years")
    private Integer years;
    @TableField(value = "ablity")
    private Double ablity;
    @TableField(value = "activity")
    private Double activity;
    @TableField(value = "communication")
    private Double communication;
    @TableField(value = "quality")
    private Double quality;
    @TableField(value = "character")
    private Double character;
    @TableField(value = "ename")
    private String ename;
    @TableField(value = "dept")
    private String dept;
    @TableField(value = "stuff")
    private String stuff;

    public Comment() {
    }

    public Comment(Integer eid, Integer years, Double ablity, Double activity, Double communication, Double quality, Double character, String ename, String dept, String stuff) {
        this.eid = eid;
        this.years = years;
        this.ablity = ablity;
        this.activity = activity;
        this.communication = communication;
        this.quality = quality;
        this.character = character;
        this.ename = ename;
        this.dept = dept;
        this.stuff = stuff;
    }

    public Comment(Integer eid, Integer years, Double ablity, Double activity, Double communication, Double quality, Double character, String ename) {
        this.eid = eid;
        this.years = years;
        this.ablity = ablity;
        this.activity = activity;
        this.communication = communication;
        this.quality = quality;
        this.character = character;
        this.ename = ename;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public Double getAblity() {
        return ablity;
    }

    public void setAblity(Double ablity) {
        this.ablity = ablity;
    }

    public Double getActivity() {
        return activity;
    }

    public void setActivity(Double activity) {
        this.activity = activity;
    }

    public Double getCommunication() {
        return communication;
    }

    public void setCommunication(Double communication) {
        this.communication = communication;
    }

    public Double getQuality() {
        return quality;
    }

    public void setQuality(Double quality) {
        this.quality = quality;
    }

    public Double getCharacter() {
        return character;
    }

    public void setCharacter(Double character) {
        this.character = character;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getStuff() {
        return stuff;
    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }
}