package com.simple.dubbo.provider;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wujing
 * @date 2020/9/24 19:34
 */
@SpringBootApplication
@Slf4j
@EnableDubbo
public class Provider {

    public static void main(String[] args) {

        SpringApplication.run(Provider.class, args);
    }
}
