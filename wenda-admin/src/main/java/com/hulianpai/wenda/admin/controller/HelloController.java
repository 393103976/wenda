package com.hulianpai.wenda.admin.controller;

import com.hulianpai.wenda.common.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author Jack
 * @create 2019/6/23 下午3:10
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("")
    public String hello(@RequestParam("name") String name) {
        return helloService.sayHello(name);
    }
}
