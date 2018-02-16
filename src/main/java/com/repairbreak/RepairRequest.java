package com.repairbreak;


import com.repairbreak.customer.Customer;
import com.repairbreak.device.Device;

public class RepairRequest extends Request {
    private Customer customer;
    private Device device;
    private String issue;
    private String details;
    private Technician tech;

    public RepairRequest() {
    }

    public RepairRequest(Customer customer, Device device, String issue) {
        this.customer = customer;
        this.device = device;
        this.issue = issue;
    }

    public RepairRequest(Customer customer, Device device, String issue, String details) {
        this.customer = customer;
        this.device = device;
        this.issue = issue;
        this.details = details;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Technician getTech() {
        return tech;
    }

    public void setTech(Technician tech) {
        this.tech = tech;
    }
}
