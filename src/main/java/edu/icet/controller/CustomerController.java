package edu.icet.controller;

import edu.icet.model.entity.Customer;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

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

    List<Customer> customerList = new ArrayList<>();

    @GetMapping("/get-all")
    public List<Customer> getAll() {
        return customerService.getAll();
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

    @GetMapping("/find-by-id/{id}")
    public Customer findByID(@PathVariable String id){
        return customerService.findById(id);
    }

    @GetMapping("/find-by-name/{name}")
    public List<Customer> findByName(@PathVariable String name){
        return customerService.findByName(name);
    }


}




// http://localhost:8080/swagger-ui/index.html