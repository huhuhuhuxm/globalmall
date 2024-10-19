package com.globalmall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.globalmall.member.generator.mapper"})
@EnableDubbo // 启用dubbo注解
public class GlobalmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalmallMemberApplication.class, args);
    }

}
