package com.briup.zhihuipingjiao.Service.Impl;

import com.briup.zhihuipingjiao.Service.ITeacherService;
import com.briup.zhihuipingjiao.bean.Teacher;
import com.briup.zhihuipingjiao.bean.ex.TeacherEX;
import com.briup.zhihuipingjiao.mapper.TeacherMapper;
import com.briup.zhihuipingjiao.mapper.ex.TeacherEXMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    private TeacherMapper teacherMapper;


    @Override
    public List<TeacherEX> findAll() throws RuntimeException {
        return null;
    }

    @Override
    public Teacher findById(int id) throws RuntimeException {
        return null;
    }

    @Override
    public void addOrUpdate(Teacher teacher) throws RuntimeException {

    }

    @Override
    public void delete(int id) throws RuntimeException {

    }

    @Override
    public List<TeacherEXMapper> search(String key) throws RuntimeException {
        return null;
    }
}