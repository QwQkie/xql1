package com.briup.zhihuipingjiao.bean.ex;

import com.briup.zhihuipingjiao.bean.Region;

public class DepartmentEX {
    private Integer id;
    private String name;
    private String description;
    private Region region;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
