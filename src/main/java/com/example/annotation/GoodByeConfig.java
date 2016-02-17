package com.example.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wonwoo on 2016. 2. 17..
 */

@Configuration
public class GoodByeConfig {

    @Bean
    public GoodByeComponent goodByeComponent(){
        return new GoodByeComponent();
    }

}
