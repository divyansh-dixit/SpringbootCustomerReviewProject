package com.example.RestApp2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestApp2.Entity.Customer;
import com.example.RestApp2.Service.CustomerService;

@RestController 
@RequestMapping("/Customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/PostCustomer")
	public Customer SaveCustomer(@RequestBody Customer customer) {
		 return this.customerService.CreateCustomer(customer);
	}
	
	@GetMapping("/GetAllcustomers")
	public List<Customer> getAllCustomer(){
		return this.customerService.getAllCustomers();
	}
	
	@GetMapping("/Getcustomerbyid/{id}")
	public Customer findCustomerById(@PathVariable int id) {
		
		return this.customerService.getCustomerbyId(id);
	}
	
	//
	
	
}
