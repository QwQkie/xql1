package com.briup.zhihuipingjiao.web.controller;

import com.briup.zhihuipingjiao.bean.Clazz;
import com.briup.zhihuipingjiao.bean.ex.ClazzEX;
import com.briup.zhihuipingjiao.service.IClazzService;
import com.briup.zhihuipingjiao.util.Message;
import com.briup.zhihuipingjiao.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Class")
public class ClazzController {
    @Autowired
    private IClazzService clazzService;

    @GetMapping("/selectClass")
    public Message selectAllEX(){
        List<ClazzEX> list = clazzService.findAllEX();
        return MessageUtil.success(list);
    }
    @PostMapping("/saveClass")
    public Message saveClass(Clazz clazz){

        clazzService.save(clazz);
        return MessageUtil.success();
    }

    @PostMapping("/deleteById")
    public Message deleteById(int id){
        clazzService.deleteById(id);
        return MessageUtil.success();
    }

    @GetMapping("/deleteBatch")
    public Message deleteBatch(int[] ids){
        for (int id : ids){
            clazzService.deleteById(id);
        }
        return MessageUtil.success();
    }

    @GetMapping("/serch")
    public Message serch(String key,String word){
        clazzService.searchEx(key, word);
        return MessageUtil.success();
    }
}
