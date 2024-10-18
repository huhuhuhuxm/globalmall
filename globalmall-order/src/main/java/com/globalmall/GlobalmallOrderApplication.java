package com.globalmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.globalmall.order.generator.mapper"})
public class GlobalmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalmallOrderApplication.class, args);
    }

}
