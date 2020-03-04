package com.sensible.dubbo.config;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author liuyc
 * @Description: 生产者配置类
 * @date 2020/3/4 000411:09
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.sensible.dubbo")
@PropertySource("classpath:spring/dubbo-provider.properties")
@ComponentScan(value = {"com.sensible.dubbo"})
public class PorviderConfiguration {

}
