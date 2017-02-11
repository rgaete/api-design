package com.socrates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.socrates")
public class RMMLevel1Application {

	public static void main(String[] args) {
		SpringApplication.run(RMMLevel1Application.class, args);
	}
}
