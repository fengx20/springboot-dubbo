package com.fengx.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fengx.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Fengx
 * @date: 2021-07-21
 * @description: 调用远程服务
 **/
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        String hello = helloService.sayHello("world");
        System.out.println(helloService.sayHello("fengx"));
        return hello;
    }
}
