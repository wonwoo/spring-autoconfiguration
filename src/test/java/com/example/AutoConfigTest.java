package com.example;

import com.example.autoconfiguration.SimpleBean;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wonwoo on 2016. 2. 17..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@Slf4j
public class AutoConfigTest {

    @Autowired
    private SimpleBean simpleBean;

    @Test
    public void test(){
        simpleBean.hello();
        log.info("id : {} , name : {}", simpleBean.getId(), simpleBean.getName());
    }
}
