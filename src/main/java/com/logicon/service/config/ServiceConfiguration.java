package com.logicon.service.config;


import com.logicon.dao.UserDAO;
import com.logicon.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Dom on 16.06.2016.
 */
@Configuration
public class ServiceConfiguration {

    @Bean
    public UserServiceImpl UserService(){
        return new UserServiceImpl();
    }

    @Bean
    public UserDAO UserDao(){
        return new UserDAO();
    }
}
