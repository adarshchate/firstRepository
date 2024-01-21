package org.example;

import org.springframework.stereotype.Component;

@Component
//@Component("com")
public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop Object Created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using Desktop..");
    }
}
