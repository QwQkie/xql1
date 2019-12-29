package com.briup.zhihuipingjiao.mapper.ex;

import com.briup.zhihuipingjiao.bean.ex.DepartmentEX;

import java.util.List;

public interface DepartmentEXMapper {
    List<DepartmentEX> findAll();
    List<DepartmentEX> search(String key);
}
