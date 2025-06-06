package com.spring.data_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DataJpaApplication.class, args);
	}
}
