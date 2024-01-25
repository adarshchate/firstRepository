package com.adarsh.app.repo;

import com.adarsh.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap) {
        System.out.println("Saved in Database..");
    }
}
