package com.sensible.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sensible.dubbo.config.ConsumerConfiguration;
import com.sensible.dubbo.service.HelloService;
import com.sensible.dubbo.service.HelloServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @Description: 消费者启动类
 * @author liuyc
 * @date 2020/3/4 000410:46
 */
public class ConsumerApplication {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        HelloServiceImpl helloService = (HelloServiceImpl) context.getBean("helloServiceImpl");
        String hiStr = helloService.doSayHello("dubbo");
        System.out.println("消费者服务启动成功:"+hiStr);
        System.in.read();
    }
}
