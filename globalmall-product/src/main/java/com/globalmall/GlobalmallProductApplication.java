package com.globalmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.globalmall.product.generator.mapper"})
public class GlobalmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalmallProductApplication.class, args);
    }

}
