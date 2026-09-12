package com.aeronwillow.x_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Getter;
import lombok.Setter;

@SpringBootApplication
public class XProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(XProjectApplication.class, args);
	}
	private String firstname;
}
