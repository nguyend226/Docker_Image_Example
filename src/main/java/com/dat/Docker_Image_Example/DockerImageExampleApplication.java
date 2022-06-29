package com.dat.Docker_Image_Example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class DockerImageExampleApplication {
	
	@GetMapping("/hello")
	public String getMessage() {
		return "Welcome to Docker container";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerImageExampleApplication.class, args);
	}

}
