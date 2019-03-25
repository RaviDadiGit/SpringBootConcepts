package com.ravi.springboot.beansandDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class DIDemoApplication {
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	ComponentAnnotationTest annotationTest;

	public static void main(String[] args) {
		SpringApplication.run(DIDemoApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	@RequestMapping(value = "getComponent",method=RequestMethod.GET)
	public String getComponent(){
		return annotationTest.sayHello();
	}
}
