package com.hulianpai.wenda.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 数据源配置
 *
 * @author Jack
 * @create 2019/6/23 下午3:31
 **/
@Configuration
@MapperScan("com.hulianpai.wenda.common.dao.mapper")
public class DataSourceConfig {
}
