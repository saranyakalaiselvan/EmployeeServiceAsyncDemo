package com.crackit.EmployeeServiceAsyncDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crackit/v1/")
public class EmployeeController {

    @GetMapping("/addresses")
    public String getAddresses() {
        return "Employee Address";
    }

    @GetMapping("/phoneNumbers")
    public String getPhoneNumbers() {
        return "Employee Phone Numbers";
    }

    @GetMapping("/names")
    public String getEmployeeNames() {
        return "Employee Names";
    }

}
