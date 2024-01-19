package org.example;

import java.security.PublicKey;

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
