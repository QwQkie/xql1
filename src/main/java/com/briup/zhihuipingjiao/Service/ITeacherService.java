package com.briup.zhihuipingjiao.Service;

import com.briup.zhihuipingjiao.bean.Teacher;

import java.util.List;

public interface ITeacherService {

    List<Teacher> findAll() throws RuntimeException;
    
}
