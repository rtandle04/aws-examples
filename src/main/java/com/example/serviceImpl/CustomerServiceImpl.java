package com.example.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Customer;
import com.example.demo.CustomerRepository;

@Service
public class CustomerServiceImpl {
	
	@Autowired
	CustomerRepository customerRepo;
	
	public List<Customer> getAllCustomer() {
		Iterable<Customer> findAll = customerRepo.findAll();
		ArrayList<Customer> custmList = new ArrayList<Customer>();
		findAll.forEach(customer -> custmList.add(customer));
		return custmList;
	}
}
