package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class SpringbootStarterActuatorTestApplication {
	
	@RequestMapping("/hello")
	@ResponseBody
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringbootStarterActuatorTestApplication.class, args);
	}
}
