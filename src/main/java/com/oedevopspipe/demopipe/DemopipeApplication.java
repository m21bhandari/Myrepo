package com.oedevopspipe.demopipe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemopipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemopipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//WebController w = new WebController();
		//w.getAllCourses();
	}

}
