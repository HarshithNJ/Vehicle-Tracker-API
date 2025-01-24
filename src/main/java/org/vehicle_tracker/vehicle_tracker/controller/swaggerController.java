package org.vehicle_tracker.vehicle_tracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class swaggerController {

    @GetMapping("/")
    public String loadHome() {
        return "redirect:/swagger-ui.html";
    }
    
    
}
