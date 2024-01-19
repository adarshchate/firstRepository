package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /**
         * 1. Application Context
         * 2. create resources directory and create spring.xml file
         * 3. add spring beans configuration xml file - spring.xml
         * 4. add  bean with id and class
         */

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        System.out.println("Hello World!");

//        Alien obj = new Alien();
//        Alien obj = (Alien) context.getBean("alien"); // typecasting
//        Alien obj = context.getBean("alien", Alien.class); /// with type
        Alien obj = context.getBean(Alien.class); /// name of the class
//        obj.setAge(21);
        System.out.println("age is: " + obj.getAge());
        obj.code();

    }

}
