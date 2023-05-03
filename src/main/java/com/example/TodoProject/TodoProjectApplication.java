package com.example.TodoProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TodoProjectApplication.class, args);
	}

	public void run(String... args) throws Exception {
		System.out.println("Here we go in linux");
	}

}
