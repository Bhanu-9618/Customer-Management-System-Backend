package edu.icet.controller;

import edu.icet.model.dto.Customer;
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

    @GetMapping("/get-customer")
    public Customer getCustomer(){
        return new Customer(
                "1",
                "saman",
                "walana",
                75000.00
        );
    }
}




//http://localhost:8080/swagger-ui/index.html