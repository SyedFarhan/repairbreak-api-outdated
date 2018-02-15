package com.repairbreak;

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

    @RequestMapping("/customers/{number}")
    public Customer getCustomer(@PathVariable String number) {
        return cs.getCustomer(number);
    }

    @RequestMapping(method=RequestMethod.POST, value="/customers")
    public void addCustomer(@RequestBody Customer customer) {
        cs.addCustomer(customer);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/customers/{number}")
    public void updateCustomer(@RequestBody Customer customer, @PathVariable String number) {
        cs.updateCustomer(customer, number);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/customers/{number}")
    public void deleteCustomer(@PathVariable String number) {
        cs.deleteCustomer(number);
    }

}
