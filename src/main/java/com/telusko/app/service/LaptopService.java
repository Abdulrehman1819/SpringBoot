package com.telusko.app.service;

import com.telusko.app.repo.LaptopRepository;
import com.telusko.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {


//    @Autowired
    LaptopRepository repo;

    public void addLaptop(Laptop laptop){
        repo.save(laptop);

        }
    public boolean isGoodForPrg(Laptop laptop){
        return true;
    }
    public LaptopRepository getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(LaptopRepository repo) {
        this.repo = repo;
    }
}
