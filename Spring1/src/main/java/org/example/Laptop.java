package org.example;

import org.springframework.stereotype.Component;

import java.security.PublicKey;

@Component
public class Laptop implements Computer {

    public Laptop(){
        System.out.println("Laptop Object Created");
    }

    @Override
    public void compile()
    {
        System.out.println("Compiling using Laptop..");
    }
}
