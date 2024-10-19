package com.globalmall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.globalmall.product.generator.mapper"})
@EnableDubbo // dubbo开启
public class GlobalmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalmallProductApplication.class, args);
    }

}
