package com.adarsh.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootFirstAppApplication.class, args);  /// it  manage all classes objects
//		System.out.println("Hello World");

		Alien obj=context.getBean(Alien.class);
		obj.code();

    }

}
