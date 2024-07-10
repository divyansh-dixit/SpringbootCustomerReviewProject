package com.example.RestApp2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestApp2.Entity.Customer;
import com.example.RestApp2.Repository.CustomerRepository;


@Service
public class CustomerServiceImplementation implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		List<Customer> customer = this.customerRepository.findAll();
		
		return customer;
	}

	@Override
	public Customer getCustomerbyId(int id) {
		// TODO Auto-generated method stub
		Optional<Customer> customer  = this.customerRepository.findById(id);
		return customer.get();
	}

	@Override
	public Customer CreateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		
		cust.setCustomerName(cust.getCustomerName());
		cust.setCustomerChoice(cust.getCustomerChoice());
		//cust.setCustomerReview(cust.getCustomerReview());
		
		Customer saveCustomer = this.customerRepository.save(cust);
		
		return saveCustomer;
		
	}

}
