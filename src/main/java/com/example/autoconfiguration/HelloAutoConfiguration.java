package com.example.autoconfiguration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wonwoo on 2016. 2. 17..
 */

@Configuration
@ConditionalOnMissingBean(name = "helloConfigSample") //빈 명이 존재 하지 않을떄
@ConditionalOnBean(name = "helloConfig")  //빈명이 존재 할때
@ConditionalOnProperty(prefix = "autoconfig.sample", name = "id", matchIfMissing = false) //prefix가 autoconfig.sample 존재 할 때
//@ConditionalOnWebApplication  //웹인지 아닌지 판단(웹 일시)
@ConditionalOnNotWebApplication //웹인지 아닌지 판단(웹이 아닐시)
@ConditionalOnJava(value = ConditionalOnJava.JavaVersion.SIX) //java 버전별로 셋팅가능(현재버전이 셋팅 버전보다 낮거나 같으면 통과다)
@ConditionalOnResource(resources = "classpath:/META-INF/resourcesfile") //리스소 경로가 있으면
@ConditionalOnClass(name = "com.example.annotation.HelloConfig") // ConditionalOnBean 과 동일 하다고 생각된다 class 가 없으면 컴파일이 안되므로 생략 (jar 만들어야되는데 ..)
@ConditionalOnMissingClass(name = "com.example.annotation.HelloConfigMissing") //ConditionalOnMissingBean 과 동일 하다고 생각된다 class 가 없으면 컴파일이 안되므로 생략 (jar 만들어야되는데..)
@ConditionalOnExpression(value = "'${spring.application.name}' == 'spring-autoconfig'")
@EnableConfigurationProperties(SampleProperties.class)
//@AutoConfigureAfter(GoodByeConfiguration.class)
@Slf4j
public class HelloAutoConfiguration {

    @Autowired
    private SampleProperties properties;

    @Bean
    public SimpleBean simpleBean() {
        log.info("hello auto config");
        return new SimpleBean(properties.getId(), properties.getName());
    }
}
