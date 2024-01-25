package com.adarsh.app;

import com.adarsh.app.model.Alien;
import com.adarsh.app.model.Laptop;
import com.adarsh.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootFirstAppApplication.class, args);  /// it  manage all classes objects
//		System.out.println("Hello World");

//        Alien obj = context.getBean(Alien.class);
//        System.out.println("Age " + obj.getAge());
//        obj.code();

        LaptopService service=context.getBean(LaptopService.class);

        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap); /// add into service class


    }

}
