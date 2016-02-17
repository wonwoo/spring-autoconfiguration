package com.example.autoconfiguration;

import com.example.annotation.GoodByeComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wonwoo on 2016. 2. 17..
 */

@Configuration
@ConditionalOnExpression(value = "'${spring.application.name}' == 'spring-autoconfig'")
@Slf4j
public class GoodByeConfiguration {

//    private SimpleBean simpleBean;

//    @Autowired
//    public GoodByeConfiguration(SimpleBean simpleBean){
//        this.simpleBean = simpleBean;
//    }

    @Bean
    public GoodByeComponent goodByeComponent(){
        log.info("goodbye auto config");
        return new GoodByeComponent();
    }
}
