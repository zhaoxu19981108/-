package com.jxd.stutrack.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.List;

/**
 * (Dept)表实体类
 *
 * @author makejava
 * @since 2020-10-31 14:37:18
 */
@SuppressWarnings("serial")
public class Dept extends Model<Dept> {
    @TableId(value="did",type= IdType.AUTO)
    private Integer did;
    @TableField(value="dname")
    private String dname;

    private List<Emp> emps;

    public Dept() {
    }

    public Dept(String dname) {
        this.dname = dname;
    }

    public Dept(Integer did, String dname) {
        this.did = did;
        this.dname = dname;
    }

    public Dept(Integer did, String dname, List<Emp> emps) {
        this.did = did;
        this.dname = dname;
        this.emps = emps;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }
}