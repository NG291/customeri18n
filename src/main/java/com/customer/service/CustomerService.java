package com.customer.service;

import com.customer.model.Customer;
import com.customer.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public Customer findById(Long id) {
       return customerRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}
