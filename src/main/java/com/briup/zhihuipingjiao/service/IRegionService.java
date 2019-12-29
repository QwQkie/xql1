package com.briup.zhihuipingjiao.service;

import com.briup.zhihuipingjiao.bean.Region;

import java.util.List;

public interface IRegionService {
    List<Region> findAll()throws RuntimeException;
}
