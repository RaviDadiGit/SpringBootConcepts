package com.ravi.springboot.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComandLineRunnerDemo implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ComandLineRunnerDemo.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		 System.out.println("Hello world will print after tomcat start up from Command Line Runner");		
	}

}
