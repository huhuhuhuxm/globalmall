package com.globalmall;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.globalmall.coupon.generator.mapper"})
@EnableDubbo // 启用dubbo注解
public class GlobalmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalmallCouponApplication.class, args);
    }

}
