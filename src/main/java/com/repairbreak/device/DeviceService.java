package com.repairbreak.device;

import com.repairbreak.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepo;
    @Autowired
    private CustomerRepository cs;

    public List<Device> getAllDevices(String customerId) {
        List<Device> devices = new ArrayList<>();
        // Stores all the devices a customer owns into an ArrayList and returns it
        deviceRepo.findByCustomerId(customerId).forEach(devices::add);
        return devices;
    }

    public void addDevice(Device device, String customerId) {
        // Check to see if that customer exists,
        // if it does then set the devices customer as that and save it to the db.
        if (cs.exists(customerId)) {
            device.setCustomer(cs.findOne(customerId));
            deviceRepo.save(device);
        }
    }

    public void updateDevice(Device device, String customerId, String deviceId) {
        // Check if customer exists,
        // then check if the device exists,
        // and save it if it does
        if (cs.exists(customerId)) {
            if(deviceRepo.exists(deviceId)) deviceRepo.save(device);
        }
    }

    public void deleteDevice(String customerId, String deviceId) {
        List<Device> devices = new ArrayList<>();
        // Returns devices belonging to the customer
        deviceRepo.findByCustomerId(customerId).forEach(devices::add);
        // Checks the ids and if the deviceId belongs to the customer, it gets deleted otherwise nothing happens
        for (Device device : devices) {
            if ( device.getId() == deviceId ) deviceRepo.delete(deviceId);
        }
    }

    public Device getDevice(String customerId, String deviceId) {
        List<Device> devices = new ArrayList<>();
        deviceRepo.findByCustomerId(customerId).forEach(devices::add);
        for (Device device : devices) {
            if ( device.getId() == deviceId ) return device;
        }
        return null;
    }
}
