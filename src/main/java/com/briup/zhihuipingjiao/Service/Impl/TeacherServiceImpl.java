package com.briup.zhihuipingjiao.service.impl;

import com.briup.zhihuipingjiao.bean.Teacher;
import com.briup.zhihuipingjiao.bean.TeacherExample;
import com.briup.zhihuipingjiao.bean.ex.TeacherEX;
import com.briup.zhihuipingjiao.mapper.TeacherMapper;
import com.briup.zhihuipingjiao.mapper.ex.TeacherEXMapper;
import com.briup.zhihuipingjiao.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private  TeacherEXMapper teacherEXMapper;


    @Override
    public List<TeacherEX> findAll() throws RuntimeException {
        return teacherEXMapper.findAll();
    }

    @Override
    public Teacher findById(int id) throws RuntimeException {
        return teacherMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addOrUpdate(Teacher teacher) throws RuntimeException {
        if(teacher==null){
            throw new RuntimeException("参数为空");
        }
        if(teacher.getId()==null){
            teacherMapper.insert(teacher);
        }else {
            teacherMapper.updateByPrimaryKey(teacher);
        }

    }

    @Override
    public void delete(int id) throws RuntimeException {
        teacherMapper.deleteByPrimaryKey(id);

    }

    @Override
    public List<TeacherEX> search(String key) throws RuntimeException {
        key=key==null?"":key;
        if(key==null || "".equals(key)){
            return findAll();
        }
        else {
            key="%"+key+"%";
           return teacherEXMapper.search(key);
        }

    }
}
