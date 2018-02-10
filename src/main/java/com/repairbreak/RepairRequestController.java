package com.repairbreak;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepairRequestController {

    @RequestMapping("/")
    public String sayHi() {
        return "Hi";
    }
}
