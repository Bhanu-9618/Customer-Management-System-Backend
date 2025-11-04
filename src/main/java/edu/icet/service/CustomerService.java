package edu.icet.service;

import edu.icet.model.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAll();
    void addCustomer(Customer customer);
}
