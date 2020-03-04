package com.sensible.dubbo.config;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description: 消费者配置类
 * @author liuyc
 * @date 2020/3/4 000410:53
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.sensible.dubbo")
@PropertySource("classpath:spring/dubbo-consumer.properties")
@ComponentScan(value = {"com.sensible.dubbo"})
public class ConsumerConfiguration {

}
