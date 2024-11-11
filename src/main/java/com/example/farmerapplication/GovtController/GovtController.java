package com.example.farmerapplication.GovtController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GovtController {

    @RequestMapping("/government")
    public String GovtRegister() {
        return "Grant&PermitPages/govtRegister";
    }
    
}
