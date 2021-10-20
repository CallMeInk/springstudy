package com.kuang.config;


import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 配置类 Configuration也是Component
 */
@Configuration
@ComponentScan("com.kuang.pojo")
public class AppConfig {

    /**
     * 方法名就是之前xml的id
     * 返回值就是class属性
     * @return
     */
    @Bean
    public User getUser(){
        return new User();
    }


}
