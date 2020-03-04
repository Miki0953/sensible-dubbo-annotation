package com.sensible.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.sensible.dubbo.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liuyc
 * @Description: 接口实现类
 * @date 2020/3/4 000410:31
 */
@Service
public class HelloServiceImpl implements HelloService {
    // @Service注解暴露服务
    private Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);
    public String sayHi(String name) {
        logger.info("请求来自消费者："+ RpcContext.getContext().getRemoteAddress());
        return "Hello,"+ name + "!";
    }
}
