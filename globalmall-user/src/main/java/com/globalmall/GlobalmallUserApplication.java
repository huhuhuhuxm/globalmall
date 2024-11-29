package com.globalmall;

import com.globalmall.user.properties.JwtProperties;
import com.globalmall.user.utils.JwtUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
// 开启属性配置
@EnableConfigurationProperties(value = {JwtProperties.class})
@MapperScan(value = {"com.globalmall.user.generator.mapper"})
public class GlobalmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalmallUserApplication.class, args);
    }

}
