package com.project.digitalbanking.mappers;

import com.project.digitalbanking.dtos.CustomerRequestDto;
import com.project.digitalbanking.dtos.CustomerResponseDto;
import com.project.digitalbanking.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    CustomerResponseDto fromCustomer(Customer customer);
    Customer fromCustomerRequestDto(CustomerRequestDto customerRequestDto);
}
