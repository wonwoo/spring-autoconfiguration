package com.example.annotation;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by wonwoo on 2016. 2. 17..
 */
@Slf4j
public class HelloComponent {

    public void hello(String name){
        log.info("Hello java Configuration {}",name);
    }
}
