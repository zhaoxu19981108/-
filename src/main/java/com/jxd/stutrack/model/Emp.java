package com.jxd.stutrack.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (Emp)表实体类
 *
 * @author makejava
 * @since 2020-10-31 14:38:15
 */
@TableName(value = "emp")
public class Emp extends Model<Emp> {
    @TableId(value = "eid",type= IdType.AUTO)
    private Integer eid;
    @TableField(value = "sid")
    private Integer sid;
    @TableField(value = "did")
    private Integer did;
    @TableField(value = "job")
    private String job;//职务
    @TableField(value = "hiredate")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date hiredate;//入职日期
    @TableField(value = "ismark")
    private Integer ismark;//0不可评价，1可评价

    private Dept dept;

    public Emp() {
    }

    public Emp(Integer did, String job, Date hiredate, Integer ismark) {
        this.did = did;
        this.job = job;
        this.hiredate = hiredate;
        this.ismark = ismark;
    }

    public Emp(Integer sid, Integer did, String job, Date hiredate, Integer ismark) {
        this.sid = sid;
        this.did = did;
        this.job = job;
        this.hiredate = hiredate;
        this.ismark = ismark;
    }

    public Emp(Integer eid, Integer sid, Integer did, String job, Date hiredate, Integer ismark) {
        this.eid = eid;
        this.sid = sid;
        this.did = did;
        this.job = job;
        this.hiredate = hiredate;
        this.ismark = ismark;
    }

    public Emp(Integer eid, Integer sid, Dept dept, Integer did, String job, Date hiredate, Integer ismark) {
        this.eid = eid;
        this.sid = sid;
        this.dept = dept;
        this.did = did;
        this.job = job;
        this.hiredate = hiredate;
        this.ismark = ismark;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getIsmark() {
        return ismark;
    }

    public void setIsmark(Integer ismark) {
        this.ismark = ismark;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}