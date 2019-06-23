package com.hulianpai.wenda.common.service;

import org.springframework.stereotype.Service;

/**
 * HelloService
 *
 * @author Jack
 * @create 2019/6/23 下午3:09
 **/
@Service
public class HelloService {
    public String sayHello(String name) {
        return "Hello! " + name;
    }
}
