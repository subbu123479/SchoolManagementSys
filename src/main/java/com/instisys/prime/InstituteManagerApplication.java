package com.instisys.prime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class InstituteManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstituteManagerApplication.class, args);
	}

}
