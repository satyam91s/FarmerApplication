package com.example.farmerapplication.FarmerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.farmerapplication.Beans.FarmerRegister;
import com.example.farmerapplication.Services.FarmerService;



@Controller
public class FarmerController {

    // @GetMapping("/farmer")
    // public String FarmerRegister() {
    //     return "Grant&PermitPages/farmerRegister";
    // }
    
    @Autowired
    private FarmerService farmerService;

    // Show Registration Form
    @GetMapping("/FarmerRegister")
    public String showRegistrationForm(Model model) {
        model.addAttribute("farmer", new FarmerRegister());
        return "Grant&PermitPages/farmerRegister";
    }

    // Handle Form Submission
    @PostMapping("/success")
    public String registerFarmer(@ModelAttribute FarmerRegister farmer, Model model) {
        farmerService.saveFarmer(farmer);
        model.addAttribute("message", "Farmer registered successfully!");
        return "Additional/success";  // Redirects to a success page
    }
    
}
