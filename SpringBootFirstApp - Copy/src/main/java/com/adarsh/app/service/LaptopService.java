package com.adarsh.app.service;

import com.adarsh.app.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    public void addLaptop(Laptop lap) {
        System.out.println("Laptop method called");
    }

    public boolean isGoodForProg(Laptop lap) {
        return true;
    }
}
