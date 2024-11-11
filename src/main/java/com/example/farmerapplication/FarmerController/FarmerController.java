package com.example.farmerapplication.FarmerController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class FarmerController {

    @GetMapping("/farmer")
    public String FarmerRegister() {
        return "Grant&PermitPages/farmerRegister";
    }
    
    
}
