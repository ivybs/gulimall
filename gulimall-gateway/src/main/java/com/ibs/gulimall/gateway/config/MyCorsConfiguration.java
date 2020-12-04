package com.ibs.gulimall.gateway.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class MyCorsConfiguration {

    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 1.配置跨域
        // 允许哪些请求头进行跨域
        corsConfiguration.addAllowedHeader("*");
        // 允许哪些请求方式进行跨域
        corsConfiguration.addAllowedMethod("*");
        // 允许哪些请求来源进行跨域
        corsConfiguration.addAllowedOrigin("*");
        // 是否允许携带cookie进行跨域
        corsConfiguration.setAllowCredentials(true);




        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsWebFilter(urlBasedCorsConfigurationSource);
    }
}
