package com.briup.zhihuipingjiao.service;

import com.briup.zhihuipingjiao.bean.Clazz;
import com.briup.zhihuipingjiao.bean.ex.ClazzEX;

import java.util.List;

public interface IClazzService {

    List<ClazzEX> findAllEX() throws RuntimeException;

    void save(Clazz clazz) throws  RuntimeException;
    void deleteById(int id) throws RuntimeException;
    void deleteAll() throws RuntimeException;
}
