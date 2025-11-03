package edu.icet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/name")
    public String getName(){
        return "saman";
    }

    @GetMapping("/age")
    public Integer getAge(){
        return 18;
    }
}
