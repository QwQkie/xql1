package com.briup.zhihuipingjiao.bean.ex;

import com.briup.zhihuipingjiao.bean.Teacher;

import java.io.Serializable;

public class ClazzEX implements Serializable {
    private Integer id;

    private String name;

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

    public Integer getServeNumber() {
        return serveNumber;
    }

    public void setServeNumber(Integer serveNumber) {
        this.serveNumber = serveNumber;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private Integer serveNumber;

    private Integer studentNumber;

    private Integer departmentId;

    private Teacher teacher;

    private String description;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
