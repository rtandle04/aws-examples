package com.example.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Customer;
import com.example.serviceImpl.CustomerServiceImpl;

@RestController
@CrossOrigin
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl customerservice;
	
	@RequestMapping(value="/home",method=RequestMethod.POST)
	public String method1(@RequestParam Customer customer) {
		System.out.println(customer.getId());
		return "Hello World";
	}
	
	@RequestMapping(value="/getCustomer",method=RequestMethod.GET)
	public Customer getCustomer(@RequestParam Customer customer) {
		Customer cust=new Customer("Ramu","Tandle");
		return cust;
	}
	
	@RequestMapping(value="/getAllCustomer",method=RequestMethod.GET ,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllCustomer(){
		return customerservice.getAllCustomer();
	}
}
