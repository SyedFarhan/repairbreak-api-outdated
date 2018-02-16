package com.repairbreak.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepo;


    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
        customerRepo.findAll().forEach(customers::add);
        return customers;
    }

    public Customer getCustomer(String id) {
        return customerRepo.findOne(id);
    }

    public void addCustomer(Customer customer) {
        customerRepo.save(customer);
    }

    public void updateCustomer(Customer customer) {
        customerRepo.save(customer);
    }

    public void deleteCustomer(String id) {
        customerRepo.delete(id);
    }
}
