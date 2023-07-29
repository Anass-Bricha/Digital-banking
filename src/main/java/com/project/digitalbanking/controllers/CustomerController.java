package com.project.digitalbanking.controllers;

import com.project.digitalbanking.dtos.CustomerRequestDto;
import com.project.digitalbanking.dtos.CustomerResponseDto;
import com.project.digitalbanking.entities.Customer;
import com.project.digitalbanking.services.interf.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/customer")
    public CustomerResponseDto customer(@RequestBody CustomerRequestDto customerRequestDto){
        return customerService.customer(customerRequestDto);
    }
}
