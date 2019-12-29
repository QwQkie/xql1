package com.briup.zhihuipingjiao.web.controller;

import com.briup.zhihuipingjiao.bean.Region;
import com.briup.zhihuipingjiao.service.IRegionService;
import com.briup.zhihuipingjiao.util.Message;
import com.briup.zhihuipingjiao.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/region")
public class RegionController {
    @Autowired
    private IRegionService iRegionService;
    @GetMapping("/findlastRegion")
    public Message findAll(){
        Region region1 = new Region();
        List<Region> regions = iRegionService.findAll();
        for(int i=regions.size()-1;i<regions.size();i++){
             region1=regions.get(i);
        }
        return MessageUtil.success(region1);
    }
}
