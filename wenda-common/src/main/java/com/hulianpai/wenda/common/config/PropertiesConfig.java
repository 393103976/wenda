package com.hulianpai.wenda.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 属性配置
 *
 * @author Jack
 * @create 2019/6/23 下午8:23
 **/
@Configuration
@PropertySource({"classpath:db.properties",
        "classpath:mybatis.properties"})
public class PropertiesConfig {
}
