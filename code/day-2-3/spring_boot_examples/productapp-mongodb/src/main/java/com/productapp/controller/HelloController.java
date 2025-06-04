package com.productapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @RequestParam
//    @PathVariable

    @GetMapping("/hello2/{name}/{add}")
    public String helloPathVariable( @PathVariable String name,  @PathVariable String add) {
        return "helloPathVariable "+ name+ " "+ add;
    }

    @GetMapping("/hello")
    public String hello( @RequestParam (name="uname") String name,  @RequestParam (name="uadd") String add) {
        return "Hello Request param "+ name+ " "+ add;
    }
}
