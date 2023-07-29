package com.project.digitalbanking.services.impl;

import com.project.digitalbanking.dtos.CustomerRequestDto;
import com.project.digitalbanking.dtos.CustomerResponseDto;
import com.project.digitalbanking.entities.Customer;
import com.project.digitalbanking.mappers.CustomerMapper;
import com.project.digitalbanking.repositories.CustomerRepository;
import com.project.digitalbanking.services.interf.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public CustomerResponseDto customer(CustomerRequestDto customerRequestDto) {
        Customer customer = customerMapper.fromCustomerRequestDto(customerRequestDto);
        return customerMapper.fromCustomer(customerRepository.save(customer));
    }

    @Override
    public List<CustomerResponseDto> customers() {
        return null;
    }

    @Override
    public CustomerResponseDto updateCustomer(CustomerRequestDto customerRequestDto) {
        return null;
    }

    @Override
    public void deleteCustomer(String customerId) {

    }
}
