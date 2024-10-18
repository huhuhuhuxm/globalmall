package com.globalmall;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.globalmall.coupon.generator.mapper"})
public class GlobalmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalmallCouponApplication.class, args);
    }

}
