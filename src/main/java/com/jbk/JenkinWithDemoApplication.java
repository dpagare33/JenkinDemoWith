package com.jbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class JenkinWithDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinWithDemoApplication.class, args);
	}
	
	@RequestMapping("/")
	public void Tst() {
		System.out.println("Called");
	}

}
