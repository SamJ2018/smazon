package com.smazon.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author sam
 * @apiNote
 * @since 2019-08-15-6:30 PM
 **/

@EnableZuulProxy
@SpringBootApplication
public class SmGateway {
    public static void main(String[] args) {
        SpringApplication.run(SmGateway.class);
    }
}
