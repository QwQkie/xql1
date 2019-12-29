package com.briup.zhihuipingjiao.service;

import com.briup.zhihuipingjiao.bean.Course;

import java.util.List;

public interface ICourseService {
    List<Course> findAll() ;
    void deleteById(int id);
    void saveOrUpdate(Course course);
//    void deleteBatch(int id);

}
