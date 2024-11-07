package com.codegym.c0424m1springdatajpa.service.impl;

import com.codegym.c0424m1springdatajpa.model.Customer;
import com.codegym.c0424m1springdatajpa.repository.ICustomerRepository;
import com.codegym.c0424m1springdatajpa.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public void remove(Long id) {

    }
}
