package com.briup.zhihuipingjiao.mapper.ex;

import com.briup.zhihuipingjiao.bean.ex.TeacherEX;

import java.util.List;

public interface TeacherEXMapper {
   List<TeacherEX> findAll();
   List<TeacherEX> search(String key);

}
