package com.vikram.ecommerce.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Ecommerce API!";
    }
}
