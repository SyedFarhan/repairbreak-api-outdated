package com.repairbreak;

import java.util.Arrays;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private List<Customer> customers = Arrays.asList(
            new Customer("Syed", "3138260007", "syedrfarhan2@gmail.com"),
            new Customer("John", "8881117777", "johntest@gmail.com" )
            );

    public List<Customer> getCustomers() {
        return customers;
    }
}
