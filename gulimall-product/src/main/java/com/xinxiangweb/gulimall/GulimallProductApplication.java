package com.xinxiangweb.gulimall;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1. Integrate MyBatis-Plus
 * 1) Import dependency
 * 2) Configure
 *     1. Configure data source properties
 *      1) Import dependency: MySQL Driver
 *      2) application.yml
 *     2. Configure MyBatis-Plus
 *      1) Use @MapperScan
 *      2) Provide mapper location
 * 2. Logic delete
 */
@MapperScan("com.xinxiangweb.gulimall.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallProductApplication {
    public static void main(String[] args) {

        SpringApplication.run(GulimallProductApplication.class, args);
    }
}