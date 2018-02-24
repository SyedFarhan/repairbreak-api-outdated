package com.repairbreak.device;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeviceController {
    @Autowired
    private DeviceService ds;

    @RequestMapping("/customers/{customerId}/devices")
    public List<Device> getAllDevices(@PathVariable String customerId) {
        return ds.getAllDevices(customerId);
    }

    @RequestMapping("/customers/{customerId}/devices/{deviceId}")
    public Device getDevice(@PathVariable String customerId, @PathVariable String deviceId) {
        return ds.getDevice(customerId, deviceId);
    }

    @RequestMapping(method= RequestMethod.POST, value="/customers/{customerId}/devices")
    public void addDevice(@RequestBody Device device, @PathVariable String customerId) {
        ds.addDevice(device, customerId);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/customers/{customerId}/devices/{deviceId}")
    public void updateDevice(@RequestBody Device device, @PathVariable String customerId, @PathVariable String deviceId ) {
        ds.updateDevice(device, customerId, deviceId);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/customers/{customerId}/devices/{deviceId}")
    public void deleteDevice(@PathVariable String customerId, @PathVariable String deviceId) {
        ds.deleteDevice(customerId, deviceId);
    }
}
