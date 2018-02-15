package com.repairbreak;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {
    private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer("1", "Syed", "3138260007", "syedrfarhan2"),
            new Customer("2", "John", "8881117777", "johntest@gmail.com" )
            ));

    public List<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomer(String number) {
        return customers.stream().filter(c -> c.getNumber().equals(number)).findFirst().get();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
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
