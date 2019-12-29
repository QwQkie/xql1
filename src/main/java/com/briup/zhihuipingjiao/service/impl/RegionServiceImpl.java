package com.briup.zhihuipingjiao.service.impl;

import com.briup.zhihuipingjiao.bean.Region;
import com.briup.zhihuipingjiao.bean.RegionExample;
import com.briup.zhihuipingjiao.mapper.RegionMapper;
import com.briup.zhihuipingjiao.service.IRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegionServiceImpl implements IRegionService {
    @Autowired
    private RegionMapper regionMapper;
    @Override
    public List<Region> findAll() throws RuntimeException {
       return regionMapper.selectByExample(new RegionExample());

    }
}
