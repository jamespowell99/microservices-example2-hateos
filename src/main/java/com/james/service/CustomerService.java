package com.james.service;

import com.james.entity.Customer;
import com.james.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by jpowel on 15/03/2017.
 */
@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer register(Customer customer) {
        Optional<Customer> customerByName = customerRepository.findByName(customer.getName());
        if (customerByName.isPresent()) {
            throw new IllegalStateException("Customer already present: " + customer.getName());
        } else {
            return customerRepository.save(customer);
        }

    }
}
