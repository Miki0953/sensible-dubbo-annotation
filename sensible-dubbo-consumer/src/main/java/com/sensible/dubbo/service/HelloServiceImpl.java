package com.sensible.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author liuyc
 * @Description: 消费接口实现类
 * @date 2020/3/4 000410:59
 */
@Component
public class HelloServiceImpl {
    @Reference
    private HelloService helloService;

    public String doSayHello(String name) {
        return helloService.sayHi(name);
    }
}
