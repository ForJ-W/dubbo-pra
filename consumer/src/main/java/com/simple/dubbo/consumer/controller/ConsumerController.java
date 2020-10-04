//package com.simple.dubbo.consumer.controller;
//
//import com.simple.dubbo.service.Service;
//import org.apache.dubbo.config.annotation.DubboReference;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
///**
// * spring mvc控制器
// *
// * @author wujing
// * @date 2020/9/24 20:01
// * @see org.springframework.web.SpringServletContainerInitializer
// * @see org.springframework.web.WebApplicationInitializer
// * @see org.springframework.web.servlet.DispatcherServlet#doDispatch(HttpServletRequest, HttpServletResponse)
// * @see org.springframework.web.servlet.HandlerExecutionChain
// * @see org.springframework.web.servlet.HandlerAdapter
// */
//@RestController
//public class ConsumerController {
//
//    /**
//     * 引用注册中心中注册的接口
//     */
//    @DubboReference
//    private Service service;
//
//    /**
//     * 可以选择使用mvc 将dubbo接口包装,这时启动consumer Application即可通过http调用dubbo
//     * 请求路径: localhost:8083/service
//     */
//    @PostMapping("/service")
//    public void service() {
//
//        service.service();
//    }
//}
