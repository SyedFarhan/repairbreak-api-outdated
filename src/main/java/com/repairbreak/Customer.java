package com.repairbreak;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    @Id
    private String id;
    private String name;
    private String number;
    private String email;
    private List<Device> devices = new ArrayList<Device>();;

    public Customer() {
    } // JPA only

    public Customer(String id, String name, String number, String email) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    @Override
    public String toString() {
        return "Customer name: " + this.getName() + "%n" +
                "number: " + this.getNumber() + "%n" +
                "email: " + this.getEmail();
    }
}
