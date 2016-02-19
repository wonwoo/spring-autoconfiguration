package com.example.beanregistrar;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by wonwoo on 2016. 2. 19..
 */

public class HelloInitializedPulisher implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof NameModel){
            NameModel nameModel = (NameModel) bean;
            nameModel.setName("wonwoo");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
    static class Registrar implements ImportBeanDefinitionRegistrar {

        private static final String BEAN_NAME = "helloInitializedPulisher";

        @Override
        public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
                                            BeanDefinitionRegistry registry) {
            if (!registry.containsBeanDefinition(BEAN_NAME)) {
                GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
                beanDefinition.setBeanClass(HelloInitializedPulisher.class);
                beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
                beanDefinition.setSynthetic(true);
                registry.registerBeanDefinition(BEAN_NAME, beanDefinition);
            }
        }
    }
}
