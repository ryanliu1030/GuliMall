package com.xinxiangweb.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 1. Remotely use other services
 * 1) Import open-feign
 * 2) Write interface to tell SpringCloud which method needs to be called remotely
 * 3) Enable open-feign in application.yml
 */
@EnableFeignClients(basePackages = "com.xinxiangweb.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
