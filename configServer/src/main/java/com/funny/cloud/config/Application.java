package com.funny.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaobin-pc on 2016/10/31.
 */
@Configuration
@EnableAutoConfiguration
@RestController
@EnableConfigServer
public class Application {

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "test";
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
