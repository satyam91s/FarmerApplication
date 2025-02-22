package com.example.farmerapplication.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.farmerapplication.Beans.FarmerRegister;
import com.example.farmerapplication.Repositories.FarmerRepo;

@Service
public class FarmerService {

    @Autowired
    private FarmerRepo farmerRepository;

    public FarmerRegister saveFarmer(FarmerRegister farmer) {
        return farmerRepository.save(farmer);
    }
}
