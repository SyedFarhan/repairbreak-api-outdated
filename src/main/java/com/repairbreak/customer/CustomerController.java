package com.repairbreak.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService cs;

    @RequestMapping("/customers")
    public List<Customer> getAllCustomers() {
        return cs.getCustomers();
    }

    @RequestMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable String id) {
        return cs.getCustomer(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/customers")
    public void addCustomer(@RequestBody Customer customer) {
        cs.addCustomer(customer);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/customers/{id}")
    public void updateCustomer(@RequestBody Customer customer) {
        cs.updateCustomer(customer);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/customers/{id}")
    public void deleteCustomer(@PathVariable String id) {
        cs.deleteCustomer(id);
    }

}
