package com.briup.zhihuipingjiao.web.controller;

import com.briup.zhihuipingjiao.bean.Course;
import com.briup.zhihuipingjiao.service.ICourseService;
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
@RequestMapping("/course")
@Api(description = "课程管理")
public class courseController {

    @Autowired
    private ICourseService courseService;

    @GetMapping("/selectAll")
    @ApiOperation(value = "查询所有课程")
    public Message selectAll() {
        List<Course> courses = courseService.findAll();
        return MessageUtil.success(courses);
    }

    @GetMapping("/deleteById")
    @ApiOperation(value = "根据ID删除数据")
    @ApiImplicitParam(name = "id", value = "课程ID", paramType = "query", dataType = "int", required = true)
    public Message deleteById(int id) {
        courseService.deleteById(id);
        return MessageUtil.success();
    }

    //    public  Message deleteBatch(int[] ins){
//        for ()
//        return MessageUtil.success();
//    }
    @PostMapping("/add")
    @ApiOperation(value = "添加课程")
    public Message addCourse(Course course) {

        courseService.saveOrUpdate(course);

        return MessageUtil.success();
    }
    @GetMapping("/deleteBatch")
    @ApiOperation(value = "批量删除")

    public Message<Object> deleteBatch(int[] ids) {

        for (int id : ids) {
            courseService.deleteById(id);
            System.out.println(id);
        }

        return MessageUtil.success();
    }
}
