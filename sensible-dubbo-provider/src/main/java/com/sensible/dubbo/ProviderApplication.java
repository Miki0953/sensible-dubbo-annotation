package com.sensible.dubbo;

import com.sensible.dubbo.config.PorviderConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @author liuyc
 * @Description: 生成者应用启动类
 * @date 2020/3/4 000410:35
 */
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PorviderConfiguration.class);
        context.start();
        System.in.read();
    }
}
