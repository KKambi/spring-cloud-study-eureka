package com.study.springclouddiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDiscoveryServiceApplication.class, args);
    }

}
