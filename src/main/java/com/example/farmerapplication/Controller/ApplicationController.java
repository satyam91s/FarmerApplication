package com.example.farmerapplication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/register")
    public String Cards() {
        return "Additional/3Cards";
    }
    
}
