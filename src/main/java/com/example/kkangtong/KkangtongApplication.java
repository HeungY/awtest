package com.example.kkangtong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class KkangtongApplication {

    public static void main(String[] args) {
        SpringApplication.run(KkangtongApplication.class, args);
    }

    @RestController
    @RequestMapping("/")
    public class test {

		@GetMapping("/hello-world")
		public String hello(){
			return "hello world !";
		}
    }
}
