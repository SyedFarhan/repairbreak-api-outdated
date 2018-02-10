package com.repairbreak;

import com.repairbreak.Customer;

public class Device {
    private String device;
    private String model;
    private String color;
    private String imei;
    private Customer customer;

    public Device() { } // JPA only

    public Device(String device, String model, String color, String imei, Customer customer) {
        this.device = device;
        this.model = model;
        this.color = color;
        this.imei = imei;
        this.customer = customer;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
