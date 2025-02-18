package com.rupam.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {

		ApplicationContext context;
        context = SpringApplication.run(SpringdemoApplication.class, args);  //creates the container
        System.out.println("Hello World!");
//		Alien alien = new Alien();
//		alien.code();
		Alien alien = context.getBean(Alien.class); //get a place for the "alien" object inside the container
		System.out.println(alien.getAge());
		alien.code();
	}

}
