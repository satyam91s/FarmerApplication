package com.example.farmerapplication.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.farmerapplication.Beans.FarmerRegister;

@Repository
public interface FarmerRepo extends JpaRepository<FarmerRegister, Long> {
    
}
