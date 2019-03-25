package com.ravi.springboot.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class ApllicationRunnerDemo implements ApplicationRunner{
	public static void main(String[] args) {
		SpringApplication.run(ApllicationRunnerDemo.class, args);

	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Hello world will print after tomcat start up from Application  Runner");
		
	}
}
