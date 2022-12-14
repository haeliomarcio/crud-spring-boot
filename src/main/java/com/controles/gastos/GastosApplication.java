package com.controles.gastos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class GastosApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(GastosApplication.class, args);
	}

}
