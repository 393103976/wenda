package com.hulianpai.wenda.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HealthCheckController
 *
 * @author Jack
 * @create 2019/6/23 下午2:57
 **/
@RestController
@RequestMapping("/health/check")
public class HealthCheckController {
    @RequestMapping("/status")
    public String status() {
        return "success";
    }
}
