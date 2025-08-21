package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Product Details Page
    @GetMapping("/properties")
    public String properties() {
        return "properties";
    }

    // Cart Page
    @GetMapping("/property-details")
    public String propertydetails() {
        return "propertydetails";
    }

    // Contact Page
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
