package com.simple.dubbo.consumer;

import com.simple.dubbo.service.Service;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * 可以选择直接通过CommandLineRunner接口回调调用dubbo接口直接运行
 * 也可以选择包装mvc 进行http再次调用
 * 选择mvc时需要配置web服务端口添加 spring-boot-starter-web pom
 * @author wujing
 * @date 2020/9/24 19:34
 * @see com.simple.dubbo.consumer.controller.ConsumerController
 */
@SpringBootApplication
@Slf4j
public class Consumer implements CommandLineRunner {

    @DubboReference
    private Service service;

    public static void main(String[] args) {

        SpringApplication.run(Consumer.class, args);
    }

    /**
     * @param args
     * @throws Exception
     * @see SpringApplication#callRunners(ApplicationContext, ApplicationArguments)
     */
    @Override
    public void run(String... args) throws Exception {

        service.service();
    }

}
