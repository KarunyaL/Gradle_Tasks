package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleTasksApplication.class, args);
		System.out.println("Welcome to Gradle!!!");
		System.out.println("Building, Packaging and Printing dependency versions using gradle task");

	}

}
