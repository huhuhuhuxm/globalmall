package com.globalmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.globalmall.member.generator.mapper"})
public class GlobalmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalmallMemberApplication.class, args);
    }

}
