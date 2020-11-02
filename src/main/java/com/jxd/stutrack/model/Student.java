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
 * (Student)表实体类
 *
 * @author makejava
 * @since 2020-10-31 14:38:49
 */
@TableName(value = "student")
public class Student extends Model<Student> {
    @TableId(value = "sid",type= IdType.AUTO)
    private Integer sid;
    @TableField(value = "sname")
    private String sname;
    @TableField(value = "sex")
    private String sex;
    @TableField(value = "nation")
    private String nation;//民族
    @TableField(value = "birth")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birth;
    @TableField(value = "birthplace")
    private String birthplace;//籍贯
    @TableField(value = "ismarriage")
    private String ismarriage;//婚否
    @TableField(value = "telphone")
    private String telphone;
    @TableField(value = "idcard")
    private String idcard;
    @TableField(value = "school")
    private String school;
    @TableField(value = "major")
    private String major;
    @TableField(value = "phonefile")
    private String phonefile;
    @TableField(value = "cid")
    private Integer cid;
    @TableField(value = "notes")
    private String notes;

    private Schedule schedule;

    public Student() {
    }

    public Student(String sname, String sex, String nation, Date birth, String birthplace, String ismarriage, String telphone, String idcard, String school, String major, String phonefile, Integer cid, String notes) {
        this.sname = sname;
        this.sex = sex;
        this.nation = nation;
        this.birth = birth;
        this.birthplace = birthplace;
        this.ismarriage = ismarriage;
        this.telphone = telphone;
        this.idcard = idcard;
        this.school = school;
        this.major = major;
        this.phonefile = phonefile;
        this.cid = cid;
        this.notes = notes;
    }

    public Student(Integer sid, String sname, String sex, String nation, Date birth, String birthplace, String ismarriage, String telphone, String idcard, String school, String major, String phonefile, Integer cid, String notes) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.nation = nation;
        this.birth = birth;
        this.birthplace = birthplace;
        this.ismarriage = ismarriage;
        this.telphone = telphone;
        this.idcard = idcard;
        this.school = school;
        this.major = major;
        this.phonefile = phonefile;
        this.cid = cid;
        this.notes = notes;
    }

    public Student(Integer sid, String sname, String sex, String nation, Date birth, String birthplace, String ismarriage, String telphone, String idcard, String school, String major, String phonefile, Schedule schedule, Integer cid, String notes) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.nation = nation;
        this.birth = birth;
        this.birthplace = birthplace;
        this.ismarriage = ismarriage;
        this.telphone = telphone;
        this.idcard = idcard;
        this.school = school;
        this.major = major;
        this.phonefile = phonefile;
        this.schedule = schedule;
        this.cid = cid;
        this.notes = notes;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this. birthplace =birthplace;
    }

    public String getIsmarriage() {
        return ismarriage;
    }

    public void setIsmarriage(String ismarriage) {
        this.ismarriage = ismarriage;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPhonefile() {
        return phonefile;
    }

    public void setPhonefile(String phonefile) {
        this.phonefile = phonefile;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}