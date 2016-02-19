package com.example.beanregistrar;

import org.springframework.stereotype.Component;

/**
 * Created by wonwoo on 2016. 2. 19..
 */
@Component
public class NameModel {
    private String name = "Kebin";

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
