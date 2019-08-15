package com.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author sam
 * @apiNote
 * @since 2019-08-15-5:34 PM
 **/

@EnableEurekaServer
@SpringBootApplication
public class SmRegistry {
    public static void main(String[] args) {
        SpringApplication.run(SmRegistry.class);
    }
}
