package com.example.RestApp2.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.RestApp2.Entity.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomers();
	
	public Customer getCustomerbyId(int id);
	
	public Customer CreateCustomer(Customer cust);
	
}
