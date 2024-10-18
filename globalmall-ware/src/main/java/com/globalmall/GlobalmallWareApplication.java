package com.globalmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.globalmall.ware.generator.mapper")
public class GlobalmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalmallWareApplication.class, args);
    }

}
