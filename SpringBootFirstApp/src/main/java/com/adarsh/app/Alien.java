package com.adarsh.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/// when we adding Components its adding in Container
@Component
public class Alien {

    /// Autowired use to get from main class directly - context/object accessing
    @Autowired
    Laptop laptop;
    public void code(){
//        System.out.println("Codding...");
        laptop.compile();
    }

}
