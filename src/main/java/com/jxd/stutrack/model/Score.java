package com.jxd.stutrack.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Score)表实体类
 *
 * @author makejava
 * @since 2020-10-31 14:38:32
 */
@SuppressWarnings("serial")
@TableName(value="score")
public class Score extends Model<Score> {
    @TableId(value="scoreid",type= IdType.AUTO)
    private Integer scoreid;
    @TableField(value="sid")
    private Integer sid;
    @TableField(value="courseid")
    private Integer courseid;
    @TableField(value="score")
    private Double score;

    public Score() {
    }

    public Score(Integer sid, Integer courseid, Double score) {
        this.sid = sid;
        this.courseid = courseid;
        this.score = score;
    }

    public Score(Integer scoreid, Integer sid, Integer courseid, Double score) {
        this.scoreid = scoreid;
        this.sid = sid;
        this.courseid = courseid;
        this.score = score;
    }

    public Integer getScoreid() {
        return scoreid;
    }

    public void setScoreid(Integer scoreid) {
        this.scoreid = scoreid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

}