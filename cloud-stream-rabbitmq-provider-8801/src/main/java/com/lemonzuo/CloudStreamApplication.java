package com.lemonzuo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author LemonZuo
 * @create 2021-02-11 18:39
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudStreamApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudStreamApplication.class, args);
    }
}
