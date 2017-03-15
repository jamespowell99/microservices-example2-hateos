package com.james.controllers;

import com.james.entity.Customer;
import com.james.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jpowel on 15/03/2017.
 */
@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    Customer register (@RequestBody Customer customer) {
        return customerService.register(customer);
    }
}
