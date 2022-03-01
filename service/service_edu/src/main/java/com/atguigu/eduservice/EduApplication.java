package com.atguigu.eduservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author LJ
 * @version 1.0
 * @date 2021/5/16 18:55
 */
@SpringBootApplication
@EnableDiscoveryClient //nacos注册
@EnableFeignClients //服务调用
@ComponentScan(basePackages = {"com.atguigu"})

public class EduApplication{

    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class,args);
    }
}
