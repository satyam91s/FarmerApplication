package com.example.farmerapplication.PurchaserController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PurchaserController {
    @RequestMapping("/PurchaserRegister")
    public String PurchaserRegister() {
        return "Grant&PermitPages/purchaserRegister";
    }
}
