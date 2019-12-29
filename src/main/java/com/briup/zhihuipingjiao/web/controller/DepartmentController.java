package com.briup.zhihuipingjiao.web.controller;

import com.briup.zhihuipingjiao.bean.Department;
import com.briup.zhihuipingjiao.bean.ex.DepartmentEX;
import com.briup.zhihuipingjiao.service.IDepartmentService;
import com.briup.zhihuipingjiao.util.Message;
import com.briup.zhihuipingjiao.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/department")
@Api(description = "年级管理")
public class DepartmentController {
    @Autowired
    private IDepartmentService iDepartmentService;
    @GetMapping("/findAll")
    @ApiOperation(value ="查询所有年级" )
    public Message findAll(){
        List<DepartmentEX> departments = iDepartmentService.findAll();
        return MessageUtil.success(departments);
    }
    @GetMapping("/findById")
    @ApiOperation(value = "根据Id查询年级")
    @ApiImplicitParam(name = "id" ,value = "年级id",paramType = "query",dataType = "int",required = true)
    public Message findById(int id){
        Department department = iDepartmentService.findById(id);
        return MessageUtil.success(department);
    }
    @PostMapping("/add")
    @ApiOperation(value = "添加年级")
    public Message add(Department department){
        iDepartmentService.addOrUpdate(department);
        return MessageUtil.success();
    }
    @GetMapping("/delete")
    @ApiOperation(value = "根据id删除班级")
    @ApiImplicitParam(name = "id" ,value = "年级id",paramType = "query",dataType = "int",required = true)
    public Message delete(int id){
        iDepartmentService.delete(id);
        return MessageUtil.success();
    }
    @PostMapping("/update")
    @ApiOperation(value = "更新年级")
    @ApiImplicitParam(name = "id" ,value = "年级id",paramType = "query",dataType = "int",required = true)
    public Message update(Department department){
        iDepartmentService.addOrUpdate(department);
        return MessageUtil.success();
    }
    @GetMapping("/search")
    @ApiOperation(value = "根据班级名搜索")
    public Message search(String key){
        List<DepartmentEX> list = iDepartmentService.search(key);
        return   MessageUtil.success(list);
    }
    @GetMapping("/deleteBatch")
    @ApiOperation(value = "批量删除")
    public Message deleteBatch(int[] ids){
        for (int id : ids) {
            iDepartmentService.delete(id);
        }
        return MessageUtil.success();
    }

}
