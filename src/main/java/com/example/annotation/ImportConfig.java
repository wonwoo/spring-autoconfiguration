package com.example.annotation;

import org.springframework.context.annotation.Import;

/**
 * Created by wonwoo on 2016. 2. 17..
 */

//HelloConfig 와 HelloConfig @Configuration 라면 안해도 된다
@Import({HelloConfig.class, HelloConfig.class})
public class ImportConfig {
}
