package com.project.digitalbanking.services.interf;

import com.project.digitalbanking.dtos.CustomerRequestDto;
import com.project.digitalbanking.dtos.CustomerResponseDto;

import java.util.List;

public interface CustomerService {
    CustomerResponseDto customer(CustomerRequestDto customerRequestDto);
    List<CustomerResponseDto> customers();
    CustomerResponseDto updateCustomer(CustomerRequestDto customerRequestDto);
    void deleteCustomer(String customerId);
}
