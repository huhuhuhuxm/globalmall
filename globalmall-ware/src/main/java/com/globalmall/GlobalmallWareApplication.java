package com.globalmall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.globalmall.ware.generator.mapper")
@EnableDubbo // 开启dubbo
public class GlobalmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalmallWareApplication.class, args);
    }

}
