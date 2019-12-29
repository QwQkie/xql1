package com.briup.zhihuipingjiao.service;

import com.briup.zhihuipingjiao.bean.Department;
import com.briup.zhihuipingjiao.bean.ex.DepartmentEX;

import java.util.List;

public interface IDepartmentService {
    List<DepartmentEX> findAll() throws RuntimeException;
    Department findById(int id) throws RuntimeException;
    void addOrUpdate(Department department) throws RuntimeException;
    void  delete(int id) throws RuntimeException;
    List<DepartmentEX> search(String key) throws  RuntimeException;

}
