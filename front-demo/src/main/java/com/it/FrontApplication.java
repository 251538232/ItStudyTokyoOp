package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.it")
@SpringBootApplication
// @PropertySource(value = "file:${property.path}/aa.properties",
// ignoreResourceNotFound = true)
public class FrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontApplication.class, args);
	}
}
