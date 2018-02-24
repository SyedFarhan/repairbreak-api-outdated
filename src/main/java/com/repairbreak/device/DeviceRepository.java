package com.repairbreak.device;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DeviceRepository extends CrudRepository<Device, String> {
    public List<Device> findByCustomerId(String customerId);
}
