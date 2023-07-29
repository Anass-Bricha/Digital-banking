package com.project.digitalbanking;

import com.project.digitalbanking.dtos.CustomerResponseDto;
import com.project.digitalbanking.entities.Account;
import com.project.digitalbanking.entities.CurrentAccount;
import com.project.digitalbanking.entities.Customer;
import com.project.digitalbanking.entities.Operation;
import com.project.digitalbanking.enums.AccountStatus;
import com.project.digitalbanking.enums.OperationType;
import com.project.digitalbanking.mappers.CustomerMapper;
import com.project.digitalbanking.repositories.AccountRepository;
import com.project.digitalbanking.repositories.CustomerRepository;
import com.project.digitalbanking.repositories.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DigitalBankingApplication implements CommandLineRunner {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private OperationRepository operationRepository;
	@Autowired
	private CustomerMapper customerMapper;

	public static void main(String[] args) {
		SpringApplication.run(DigitalBankingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer();
		customer.setName("anass");
		customer.setEmail("eate");
		customer.setCustomerName("test");
		customer.setPassword("123132");
		customerRepository.save(customer);

		Account account = new CurrentAccount();
		account.setAccountNumber(123123);
		account.setBalance(1122);
		account.setCreatedAt(new Date());
		account.setStatus(AccountStatus.CREATED);
		account.setCustomer(customer);

		accountRepository.save(account);


		Operation operation = new Operation();
		operation.setAccount(account);
		operation.setAmount(123);
		operation.setDate(new Date());
		operation.setType(OperationType.CREDIT);

		operationRepository.save(operation);

		CustomerResponseDto customerResponseDto = customerMapper.fromCustomer(customer);

		System.out.println(customerResponseDto.getEmail());
	}
}
