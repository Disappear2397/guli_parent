package com.atguigu.educenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author LJ
 * @version 1.0
 * @date 2021/5/27 20:23
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.atguigu"})
@MapperScan("com.atguigu.educenter.mapper")
public class UcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UcenterApplication.class, args);
    }
}
