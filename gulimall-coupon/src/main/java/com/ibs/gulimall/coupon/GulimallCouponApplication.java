package com.ibs.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * nacos 配置中心
 * 1.引入依赖
 * 2.创建一个bootstrap.properties
 * 3.需要在配置中心默认添加一个（bootstrap.properties中配置的spring.application.name）.properties.
 * 4.给配置中心中的配置文件添加任何配置
 * 5.动态获取配置：
 *      @RefreshScope  :动态获取并刷新配置
 *      @Value("${配置项的名称}"): 获取到配置
 *      如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置
 *
 * 6.细节
 * 1）命名空间
 * 2）配置集
 * 3）配置集ID
 * 4）配置分组
 *
 * */



@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
