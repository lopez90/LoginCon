package com.logicon.service.config;
import com.logicon.service.TextViewImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Dom on 15.06.2016.
 */
@Configuration
public class TextViewConfig {

    @Bean
    public TextViewImpl textViewImpl()
    {
        return new TextViewImpl();
    }
}
