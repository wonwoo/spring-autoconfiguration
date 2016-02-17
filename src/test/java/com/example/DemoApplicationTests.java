package com.example;

import com.example.annotation.GoodByeComponent;
import com.example.annotation.HelloComponent;
import com.example.annotation.ImportConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class DemoApplicationTests {

	@Autowired
	private HelloComponent helloComponent;

	@Autowired
	private GoodByeComponent goodByeComponent;

	@Test
	public void contextLoads() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ImportConfig.class);
		HelloComponent helloComponent = (HelloComponent) context.getBean("helloComponent");
		helloComponent.hello("wonwoo");
	}
}
