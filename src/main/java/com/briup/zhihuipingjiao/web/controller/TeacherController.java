package com.briup.zhihuipingjiao.web.controller;


import com.briup.zhihuipingjiao.Service.ITeacherService;
import com.briup.zhihuipingjiao.bean.ex.TeacherEX;
import com.briup.zhihuipingjiao.mapper.TeacherMapper;
import com.briup.zhihuipingjiao.util.Message;
import com.briup.zhihuipingjiao.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
@Api(description = "老师管理")

public class TeacherController {
    @Autowired
    private ITeacherService iTeacherService;

    @GetMapping("/findAll")
    @ApiOperation(value = "查询所有老师")
    public Message findAll(){
        List<TeacherEX> teachers=iTeacherService.findAll();
        return  MessageUtil.success(teachers);

    }


}
