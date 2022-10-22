package com.app;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootLoginappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac=SpringApplication.run(SpringbootLoginappApplication.class, args);
		
		System.out.println("my app is running on local server...");
	}

}
