package com.globalmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class GlobalmallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalmallGatewayApplication.class, args);
    }

}
