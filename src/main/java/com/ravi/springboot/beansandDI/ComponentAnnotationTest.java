package com.ravi.springboot.beansandDI;

import org.springframework.stereotype.Component;

@Component
public class ComponentAnnotationTest {
	
	 public ComponentAnnotationTest(){
		System.out.println("component instatntiated");
	}
 public  String sayHello(){
	 return "hello from component";
 }
}
