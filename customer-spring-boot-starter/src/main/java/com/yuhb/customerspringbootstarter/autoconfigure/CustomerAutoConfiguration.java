package com.yuhb.customerspringbootstarter.autoconfigure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 测试自动装配 配置类
 * Created by yu.hb on 2019-10-07
 */
@Configuration
public class CustomerAutoConfiguration {

    @Bean
    public String user() {
        return "张三";
    }
}
