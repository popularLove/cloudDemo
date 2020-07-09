package com.popular.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @program: cloud2020
 * @description:
 * @author: popularLove
 * @create: 2020-07-08 18:09
 */
@SpringBootApplication(exclude = SecurityAutoConfiguration.class, scanBasePackages = {"com.popular.cloud"})
@MapperScan("com.popular.cloud.mapper")
@EnableScheduling
@EnableCaching
@EnableDiscoveryClient
public class Pay8001Application {
        public static void main(String[] args) {
            SpringApplication.run(Pay8001Application.class, args);
        }

}

