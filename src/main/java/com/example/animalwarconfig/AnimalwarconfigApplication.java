package com.example.animalwarconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AnimalwarconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalwarconfigApplication.class, args);
	}

}
