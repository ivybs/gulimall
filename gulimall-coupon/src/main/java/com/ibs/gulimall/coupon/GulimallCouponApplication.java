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
 * 1）命名空间:配置隔离;
 *      默认: public(保留空间);默认新增的所有配置都在public空间。
 *      ①开发，测试，生产:利用命名空间来做环境隔离。
 *      注意:在bootstrap. properties;配置上，需要使用哪个命名空间下的配置,
 *      spring.cloud.nacos.config.namespace=cf706d04-38b9-45cf-bc97-1b8404a811b6
 *      ②每一个微服务之间相互隔离，每一个微服务都拆功能键自己的命名空间，只加载自己命名空间下的所有配置
 * 2）配置集：所有的配置的集合就叫做配置集，比如一个bootstrap.properties文件里面的所有配置
 * 3）配置集ID：类似文件名；Data ID官网中给出：${prefix} - ${spring.profiles.active} . ${file-extension}
 *       prefix： default value is spring.application.name value, which can also be configured via the configuration item spring.cloud.nacos.config.prefix.
 *       file-extension： is the data format of the configuration content, which can be configured by the configuration item spring.cloud.nacos.config.file-extension.
 *                  Currently only the properties type is supported.
 *       when the activeprofile： is empty, the corresponding connector - will also not exist,
 *       and the splicing format of the dataId becomes ${prefix}.${file-extension}
 *
 *
 * 4）配置分组
 *      spring.cloud.nacos.config.group=1111
 *      应用方法：每个微服务一个命名空间，然后在每个命名空间下通过采用不同的分组来指定具体的开发、测试、生产环境等
 *
 * 5）同时加载多个配置集
 *          spring.cloud.nacos.config.ext-config[0].data-id=datasource.yml
 *          spring.cloud.nacos.config.ext-config[0].group=dev
 *          spring.cloud.nacos.config.ext-config[0].refresh=true
 *
 *          spring.cloud.nacos.config.ext-config[1].data-id=mybatis.yml
 *          spring.cloud.nacos.config.ext-config[1].group=dev
 *          spring.cloud.nacos.config.ext-config[1].refresh=true
 *
 *          spring.cloud.nacos.config.ext-config[2].data-id=other.yml
 *          spring.cloud.nacos.config.ext-config[2].group=dev
 *          spring.cloud.nacos.config.ext-config[2].refresh=true
 *          ①微服务任何配置信息，任何配置文件都可以放在配置中心
 *          ②只需要在bootstrap.properties中说明加载配置中心哪些配置文件即可
 *          ③@Value @ConfigurationProperties @RefreshScope
 *  以前springboot任何地方从配置文件中获取值，都能使用
 *  配置中心有的优先使用配置中心中的。
 *
 *
 * */



@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
