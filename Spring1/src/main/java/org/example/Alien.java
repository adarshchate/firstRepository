package org.example;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien Object Created");
    }

    /// use ConstructorProperties when sequence of constructor-args name is not properly in bean-xml config
//    @ConstructorProperties({"age","lap"})
//    public Alien(int age, Laptop lap) {
//        this.age = age;
//        this.lap = lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Setter is Called");
        this.age = age;
    }

//    public Laptop getLap() {
//        return lap;
//    }
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding..");
        com.compile();
    }
}
