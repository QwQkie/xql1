package com.briup.zhihuipingjiao.service.impl;

import com.briup.zhihuipingjiao.bean.Course;
import com.briup.zhihuipingjiao.bean.CourseExample;
import com.briup.zhihuipingjiao.mapper.CourseMapper;
import com.briup.zhihuipingjiao.service.ICourseService;
import com.briup.zhihuipingjiao.util.Message;
import com.briup.zhihuipingjiao.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {
    @Autowired
    private CourseMapper courseMapper;


    @Override
    public List<Course> findAll() throws  RuntimeException{
        CourseExample example = new CourseExample();
        List<Course>course =courseMapper.selectByExample(example);
        return course;
    }

    @Override
    public void deleteById(int id) throws RuntimeException {
        courseMapper.deleteByPrimaryKey(id);
    }
//    public Message deleteBAtch(int[] ids){
//        for (int id : ids){
//            courseMapper.deleteById(id);
//                System.out.println(id);
//            }
//            return MessageUtil.success();
//
//    }

    @Override
    public void saveOrUpdate(Course course) throws  RuntimeException {
        if(course == null){
            throw new RuntimeException("参数为空");
        }
        if (course.getId() ==null){
            courseMapper.insert(course);

        }else {
            courseMapper.updateByPrimaryKey(course);

        }
    }

//    @Override
//    public void deleteBatch(int[] ids) {
//
//        for (int id : ids){
//            courseS.deleteById(id);
//            System.out.println(id);
//        }
//

    }

