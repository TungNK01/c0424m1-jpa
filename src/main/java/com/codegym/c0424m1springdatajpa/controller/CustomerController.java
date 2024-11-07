package com.codegym.c0424m1springdatajpa.controller;

import com.codegym.c0424m1springdatajpa.model.Customer;
import com.codegym.c0424m1springdatajpa.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("")
    public ModelAndView getAllCustomers() {
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customers", iCustomerService.findAll());
        return modelAndView;
    }
}
