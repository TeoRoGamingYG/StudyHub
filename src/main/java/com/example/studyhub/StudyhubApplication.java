package com.example.studyhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class StudyhubApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyhubApplication.class, args);
	}

}
