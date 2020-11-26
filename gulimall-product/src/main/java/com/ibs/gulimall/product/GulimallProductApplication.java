package com.ibs.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 1.整合mybatis plus
 *      1)导入依赖
 *          <dependency>
 *              <groupId>com. baomidou</groupId>
 *              <artifactId>mybatis-plus- boot-starter</artifactId>
 *               <version>3.2.0</version>
 *          </dependency>
 *      2）配置（https://baomidou.com/guide/quick-start.html）
 *          ①.配置数据源：导入数据库的驱动 mysql-connect-java pom  再在application.yml文件中进行配置
 *          ②.配置mybatis-plus相关信息 在springboot启动类上添加@MapperScan注解 告诉mybatisplus 数据库映射文件的位置 在application.yml中配置
 * */
@MapperScan("com.ibs.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
