package com.example.beanregistrar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by wonwoo on 2016. 2. 19..
 */
@Configuration
@Import(HelloInitializedPulisher.Registrar.class)
public class RegistrarConfig {
}
