package com.example;

import com.example.beanregistrar.NameModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private NameModel nameModel;


	@Override
	public void run(String... strings) throws Exception {
		System.out.println(nameModel.getName());
	}
}
