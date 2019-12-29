package com.briup.zhihuipingjiao.service;

import com.briup.zhihuipingjiao.bean.Teacher;
import com.briup.zhihuipingjiao.bean.ex.TeacherEX;
import com.briup.zhihuipingjiao.mapper.ex.TeacherEXMapper;

import java.util.List;

public interface ITeacherService {

    List<TeacherEX> findAll() throws RuntimeException;
    Teacher findById(int id) throws RuntimeException;
    void addOrUpdate(Teacher teacher) throws RuntimeException;
    void  delete(int id) throws RuntimeException;
    List<TeacherEX> search(String key) throws  RuntimeException;
}
