package com.adarsh.app.service;

import com.adarsh.app.repo.LaptopRepository;
import com.adarsh.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap) {
//        System.out.println("Laptop method called");
        repo.save(lap);
    }


    public boolean isGoodForProg(Laptop lap) {
        return true;
    }
}
