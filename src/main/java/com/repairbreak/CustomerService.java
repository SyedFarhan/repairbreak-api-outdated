package com.repairbreak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepo;


    private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer("Syed", "3138260007", "syedrfarhan2"),
            new Customer("John", "8881117777", "johntest@gmail.com" )
            ));

    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
        customerRepo.findAll().forEach(customers::add);
        return customers;
    }

    public Customer getCustomer(String number) {
        return customerRepo.findOne(number);

        //return customers.stream().filter(c -> c.getNumber().equals(number)).findFirst().get();
    }

    public void addCustomer(Customer customer) {
        customerRepo.save(customer);
    }

    public void updateCustomer(Customer customer, String number) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getNumber().equals(number)) customers.set(i, customer);
        }
    }

    public void deleteCustomer(String number) {
        customers.removeIf(c -> c.getNumber().equals(number));
    }
}
