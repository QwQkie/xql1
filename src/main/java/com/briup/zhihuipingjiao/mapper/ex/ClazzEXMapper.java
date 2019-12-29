package com.briup.zhihuipingjiao.mapper.ex;

import com.briup.zhihuipingjiao.bean.ex.ClazzEX;

import java.util.List;

public interface ClazzEXMapper {

    List<ClazzEX> findAll();
    List<ClazzEX> selectClazz(String word);
}
