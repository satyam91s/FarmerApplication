package com.example.farmerapplication.Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "farmer_register")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FarmerRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String username;
    private String email;
    private String phoneNumber;
    private String password;
    private String country;
    private String state;
    private String district;
    private String tehsil;
    private String gender;
}
