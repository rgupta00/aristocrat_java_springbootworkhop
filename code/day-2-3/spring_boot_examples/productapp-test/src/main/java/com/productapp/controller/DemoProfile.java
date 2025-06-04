package com.productapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoProfile {
    @Value("${app.name}")
    private String val;

    @GetMapping("val")
    public String printVal(){
        return val;
    }
}
