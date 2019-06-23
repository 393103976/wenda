package com.hulianpai.wenda.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hulianpai.wenda")
public class WendaAdminApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WendaAdminApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WendaAdminApplication.class);
    }
}
