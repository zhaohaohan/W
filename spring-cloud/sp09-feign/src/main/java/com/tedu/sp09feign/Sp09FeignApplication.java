package com.tedu.sp09feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableFeignClients
//@EnableDiscoveryClient
//@SpringBootApplication
@SpringCloudApplication
@EnableCircuitBreaker
public class Sp09FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sp09FeignApplication.class, args);
    }

}
