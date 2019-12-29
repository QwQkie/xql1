package com.briup.zhihuipingjiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.briup.zhihuipingjiao.mapper")
public class ZhihuipingjiaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhihuipingjiaoApplication.class, args);
    }

}
