package com.xinxiangweb.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 1、如何使用nacos作为配置中心统一管理配置
 * 1）、引入依赖
 * 2）、创建一个bootstrap.properties
 * 3）、需要给配置中心默认添加一个叫数据集（Data Id）gulimall-coupon.properties
 * 4）、给应用名.properties添加任何配置
 * 5）、动态获取配置
 * @RefreshScope: 动态获取并刷新配置
 * @Value("${配置项的名}"): 获取到配置
 * 如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置
 * 2、细节
 * 1）、命名空间：配置隔离
 * 默认：public（保留空间）：默认新增的所有配置都在public空间
 * 1、开发，测试，生产：利用命名空间来做环境隔离
 * 注意：在bootstrap.properties；配置上，需要使用哪个命名空间下的配置
 * spring.cloud.nacos.config.namespace=5e9c1c0c-1b1d-4b1e-8c7c-1c8c1c1c1c1c
 * 2）、配置集：所有的配置的集合
 * 3）、配置集ID：类似文件名
 * Data ID：类似文件名
 * 4）、配置分组：
 * 默认所有的配置集都属于：DEFAULT_GROUP
 * 1111、111、111
 * 5）、同时加载多个配置集
 * 1）、微服务任何配置信息，任何配置文件都可以放在配置中心中
 * 2）、只需要在bootstrap.properties说明加载配置中心中哪些配置文件即可
 * 3）、@Value，@ConfigurationProperties。。。
 * 6）、同时加载多个配置集
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
