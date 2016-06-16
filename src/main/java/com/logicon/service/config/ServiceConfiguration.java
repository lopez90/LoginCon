package com.logicon.service.config;


import com.logicon.service.impl.UserServiceImpl;
import com.logicon.service.interf.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Dom on 16.06.2016.
 */

@Configuration
public class ServiceConfiguration {

    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }

}
