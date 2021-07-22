package com.fengx.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fengx.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author: Fengx
 * @date: 2021-07-21
 * @description:
 **/
@Component
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
