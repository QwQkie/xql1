package com.briup.zhihuipingjiao.service.impl;

import com.briup.zhihuipingjiao.bean.Department;
import com.briup.zhihuipingjiao.bean.DepartmentExample;
import com.briup.zhihuipingjiao.bean.ex.DepartmentEX;
import com.briup.zhihuipingjiao.mapper.DepartmentMapper;
import com.briup.zhihuipingjiao.mapper.ex.DepartmentEXMapper;
import com.briup.zhihuipingjiao.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentImpl implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private DepartmentEXMapper departmentEXMapper;

    @Override
    public List<DepartmentEX> findAll() throws RuntimeException{
        return departmentEXMapper.findAll();
    }

    @Override
    public Department findById(int id) throws RuntimeException {
       return departmentMapper.selectByPrimaryKey(id);

    }

    @Override
    public void addOrUpdate(Department department) throws RuntimeException {
        if(department==null){
            throw new RuntimeException("参数为空");
        }
        if(department.getId()==null){
            departmentMapper.insert(department);
        }else {
            departmentMapper.updateByPrimaryKey(department);
        }
    }

    @Override
    public void delete(int id) throws RuntimeException {
        departmentMapper.deleteByPrimaryKey(id);

    }

    @Override
    public List<DepartmentEX> search(String key) throws RuntimeException {
        key=key==null?"":key;
        if(key==null && "".equals(key)){
          return  findAll();
        }
        else {
            key="%"+key+"%";
            return departmentEXMapper.search(key);
        }
    }
}
