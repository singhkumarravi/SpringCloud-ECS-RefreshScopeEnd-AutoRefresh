package com.olive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringCloudEcsEmployeeConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEcsEmployeeConfigServerApplication.class, args);
	}

}
